package com.kh.springhome.rest;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kh.springhome.configuration.FileUploadProperties;
import com.kh.springhome.dao.AttachDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.StatDto;

@CrossOrigin
@RestController
@RequestMapping("/rest/member")
public class MemberRestController {

   @Autowired
   private MemberDao memberDao;
   private File dir;
   
   @PostMapping("/idCheck")
   public String idCheck(@RequestParam String memberId) {
      MemberDto memberDto = memberDao.selectOne(memberId);
      if(memberDto == null) {//아이디가 없으면
         return "Y";
      }
      else {//아이디가 있으면
         return "N";
      }
   }
   
   @PostMapping("/nicknameCheck")
   public String nicknameCheck(@RequestParam String memberNickname) {
      MemberDto memberDto = 
         memberDao.selectOneByMemberNickname(memberNickname);
      if(memberDto == null) {
         return "Y";
      }
      else {
         return "N";
      }
   }
   
   //회원 등급별 인원 수 데이터 반환 매핑
   
   @GetMapping("/stat/count")
   public List<StatDto> statCount() {
      
      return memberDao.selectGroupByMemberLevel();
      
   
      
   }
   //프로필 업로드 다운로드
   @Autowired private FileUploadProperties props;   
   @Autowired private AttachDao attachDao;
   
   @PostConstruct//모든 로딩이 끝나면 자동으로 실행되는 메소드
   public void init() {
      dir = new File(props.getHome());
      dir.mkdirs();
   }
   
   @PostMapping("/upload")
   //json
   //비동기 통신에서는 화면에서 다음 작업이 가능하도록 파일 번호 등을
   public Map<String, Object> upload(@RequestParam MultipartFile attach) throws IllegalStateException, IOException {

      //[1]시퀀스 번호를 생성
      
      int attachNo = attachDao.sequence();
      
      
      //절대규칙
      //파일은 하드디스크에 정보는 DB에 
      
      //[2] 시퀀스 번호를 파일명으로 하여 실제 파일을 저장한다
      //-같은이름 충돌 방지
//      String home = System.getProperty("user.home");
//      File dir = new File(home,"upload");//저장할 디렉토리
//      dir.mkdirs();//디렉토리생성
      
      File target = new File(dir,String.valueOf(attachNo));//저장할 파일 객체
      attach.transferTo(target);//저장
      
      //[3] DB에 저장한 파일의 정보를 모아서 insert
      AttachDto attachDto = new AttachDto();
      attachDto.setAttachNo(attachNo);
      attachDto.setAttachName(attach.getName());
      attachDto.setAttachSize(attach.getSize());
      attachDto.setAttachType(attach.getContentType());
      attachDao.insert(attachDto);
      
      //화면에서 사용할 수 있도록 파일 번호 또는 다운주소 반환
      //return 객체 or map
      return Map.of("attachNo",attachNo);
   }
   
   //다운로드는 비동기나 동기나 똑같은 (파일번호만 알면 된다)
   @RequestMapping("/download")
   public ResponseEntity<ByteArrayResource> download(@RequestParam int attachNo) throws IOException{
      
      AttachDto attachDto = attachDao.selectOne(attachNo);
      if(attachDto == null) {
         //throw new NoTargetException("파일 없음");//내가만든 예외로 통합
         return ResponseEntity.notFound().build();//404 반환
      }
//      String home = System.getProperty("user.home");
//      File dir = new File(home, "upload");
      File target = new File(dir, String.valueOf(attachDto.getAttachNo()));
      
      byte[] data = FileUtils.readFileToByteArray(target);//실제파일정보 불러오기
      ByteArrayResource resource = new ByteArrayResource(data);
      
      return ResponseEntity.ok()
            .header(HttpHeaders.CONTENT_ENCODING, StandardCharsets.UTF_8.name())
            .contentLength(attachDto.getAttachSize())
            .header(HttpHeaders.CONTENT_TYPE, attachDto.getAttachType())
            .header(HttpHeaders.CONTENT_DISPOSITION, 
               ContentDisposition.attachment()
               .filename(attachDto.getAttachName(), StandardCharsets.UTF_8)
               .build().toString()
            )
         .body(resource);
      
   }
   
   
   
   
   
}