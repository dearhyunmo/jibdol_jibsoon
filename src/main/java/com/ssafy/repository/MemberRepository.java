package com.ssafy.repository;

import java.util.List;
import java.util.Map;

import com.ssafy.dto.Member;

public interface MemberRepository {
	String login(Map<String,String> m);
	void add(Member member);
	Member search(String userid);
	List<Member> searchAll();
	void update(Member member);
	void delete(String userid);
	String findbyphone(String userid, String name, String phone);
	String findbyemail(String userid, String name, String email);
}