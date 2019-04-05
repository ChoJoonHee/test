package org.joonhee.jdbc.spring.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);
		
		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("slaxer@hanmail.net");
		req.setPassword("xxxx");
		req.setName("Joonhee");

		// 회원 등록
		regService.regist(req);
	}
}