package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.error.AuthorityException;
@Component
public class BoardInterceptor implements HandlerInterceptor{
   @Autowired
   private BoardDao boardDao;
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
         throws Exception {
      HttpSession session = request.getSession();
      String memberId = (String) session.getAttribute("name");
      
      String boardNo = request.getParameter("boardNo");
      
      BoardDto dto =boardDao.selectOne(Integer.parseInt(boardNo));
      String writer = dto.getBoardWriter();
      System.out.println(writer);
      System.out.println(boardNo);
      
      boolean isSameId = writer != null && writer.equals(memberId);
      if(isSameId) return true;
      else throw new AuthorityException("다른사용자의 글입니다");
   }
}