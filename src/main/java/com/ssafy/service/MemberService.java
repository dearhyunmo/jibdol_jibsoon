package com.ssafy.service;

import java.util.List;

import com.ssafy.dto.Member;

public interface MemberService {
	String login(String uid, String upw);	
	void add(Member member);
	List<Member> searchAll();
	Member search(String userid);
	void update(Member member);
	void delete(String userid);
	String findbyphone(String userid, String name, String phone);
	String findbyemail(String userid, String name, String email);
}