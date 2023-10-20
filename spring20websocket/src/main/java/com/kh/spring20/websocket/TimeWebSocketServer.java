package com.kh.spring20.websocket;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TimeWebSocketServer extends TextWebSocketHandler{
//public class TimeWebSocketServer implements WebSocketHandler{

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		log.debug("사용자 접속 = {}", session);
		log.debug(today.toString() + " " + now.toString().substring(0, 8) + " 사용자 접속 성공");
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		log.debug("사용자 종료 = {}", session);
		log.debug("종료사유 = {}", status);
		log.debug(today.toString() + " " + now.toString().substring(0, 8) + " 사용자 접속 종료");
	}
}
