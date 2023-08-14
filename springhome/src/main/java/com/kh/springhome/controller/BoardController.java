package com.kh.springhome.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/write")
	public String insert(HttpSession session) {
		String boardWriter = (String) session.getAttribute("name");
		if (boardWriter.equals(session.getAttribute("name"))) {
			return "/WEB-INF/views/board/write.jsp";
		} else
			return "redirect:에러페이지";
	}

	@PostMapping("/write")
	public String insert(@ModelAttribute BoardDto boardDto, HttpSession session) {
		String boardWriter = (String) session.getAttribute("name");

		int boardNo = boardDao.sequence();
		boardDto.setBoardNo(boardNo);
		boardDto.setBoardWriter(boardWriter);
		boardDao.insert(boardDto);
		return "redirect:detail?boardNo=" + boardNo;
	}

	@RequestMapping("/list")
	public String list(Model model, @RequestParam(required = false) String type,
			@RequestParam(required = false) String keyword, @RequestParam(defaultValue = "1") int pageNo,
			@RequestParam(defaultValue = "10") int pageSize) {
//		pageNo= boardDao.total();
//		pageSize = boardDao.total() / 10 + boardDao.total() % 10;
		
		
		List<BoardDto> list = boardDao.list(type, keyword, pageNo, pageSize);
		model.addAttribute("list", list);
		// 디버깅
		System.out.println(pageSize);
		System.out.println(pageNo);
		System.out.println(list.size());
		return "/WEB-INF/views/board/list.jsp";
	}

	@RequestMapping("/detail")
    public String detail(Model model, @RequestParam int boardNo, HttpSession session, @ModelAttribute MemberDto memberDto) {
        BoardDto boardDto = boardDao.selectOne(boardNo);
        Map<String, Set<Integer>> memberViews = (Map<String, Set<Integer>>) session.getAttribute("memberViews"); 
       
        if (memberViews == null) {
            memberViews = new TreeMap<>();
            session.setAttribute("memberViews", memberViews); 
        }

        String id = (String) session.getAttribute("name");
        Set<Integer> view = memberViews.get(id);
        if (view == null) {
            view = new HashSet<>();
            memberViews.put(id, view);
        }
        if (id.equals(boardDto.getBoardWriter())) {
            boardDto.setBoardReadcount(boardDto.getBoardReadcount() * 0);
            session.setAttribute("memberViews", memberViews); 
            boardDao.updateRead(boardDto.getBoardNo());
        }

        else if (!view.contains(boardNo)) {
            boardDto.setBoardReadcount(boardDto.getBoardReadcount() + 1);
            view.add(boardNo);
            session.setAttribute("memberViews", memberViews); 
            boardDao.updateRead(boardDto.getBoardNo());
        }

        //작성자와 세션에 있는 아이디가 같으면 리드카운트0을 한다
        //작성자와 세션에 있는 아이디가 같으면 -1을한다 = 계속 들어가면 ----된다
        //작성자와 세션에 있는 아이디가 같으면 ...뭘 해야 할까 

        // 모델로 dto를 전송
        model.addAttribute("boardDto", boardDto);
        model.addAttribute("memberDto", memberDto);
        // 디버그
        System.out.println("READCOUNT = " + memberViews.toString());
        // 상세페이지로 이동
        return "/WEB-INF/views/board/detail.jsp";
    }

	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}

	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		boolean result = boardDao.update(boardDto);
		if (result)
			return "redirect:detail?boardNo=" + boardDto.getBoardNo();
		else
			return "redirect:error";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boolean result = boardDao.delete(boardNo);
		if (result)
			return "redirect:/board/list";
		else
			return "redirect:에러페이지";
	}

	@RequestMapping("/like")
    public String like(@RequestParam int boardNo, Model model, HttpSession session) {
        BoardDto boardDto = boardDao.selectOne(boardNo);

        // 세션에서 likeCountsByMember 맵을 가져옴
        Map<String, Set<Integer>> logInId = (Map<String, Set<Integer>>) session.getAttribute("logInId");

        if (logInId == null) {
            logInId = new HashMap<>();
            session.setAttribute("logInId", logInId);
        }

        String id = (String) session.getAttribute("name");

        Set<Integer> likeCount = logInId.get(id);
        if (likeCount == null) {
            likeCount = new HashSet<>();
            logInId.put(id, likeCount);
        }

        if (!likeCount.contains(boardNo)) {
            boardDto.setBoardLikecount(boardDto.getBoardLikecount() + 1);
            likeCount.add(boardNo);
            boardDao.updateLike(boardDto.getBoardNo(), boardDto.getBoardLikecount());
        } else if (likeCount.contains(boardNo)) {
            boardDto.setBoardLikecount(boardDto.getBoardLikecount() - 1);
            likeCount.remove(boardNo);
            boardDao.updateUnlike(boardDto.getBoardNo(), boardDto.getBoardLikecount());
        }

        model.addAttribute("boardDto", boardDto);
        System.out.println("LIKE ARR = "+logInId.toString());

        return "redirect:detail?boardNo=" + boardNo;
    }
}
