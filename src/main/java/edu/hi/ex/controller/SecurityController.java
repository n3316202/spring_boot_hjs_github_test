package edu.hi.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 작성자 : 홍길동 
 * 날짜 : 2002-07-08
 * 내용 : 시큐리티 관련 
 * 특이사항 : 시큐리티 설정시 지금은 csrf 끄고 있음 
 * 추후 enable 시킬 예정임
 * 또한 테스트 파일 에서 해당 컨트롤러 통한 테스트 내용 확인 가능
 * 주석은 차후 다음 마스터로 머지시 정리 예정
 * 
 * 
 * 
 * */

@RestController
public class SecurityController  {

	@GetMapping("/")
	public String Home() {
		return "Hello World";
	}

}
