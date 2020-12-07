package com.ssafy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.dto.Member;
import com.ssafy.repository.MemberRepository;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private SqlSession session;
	
	@Override
	public String login(String uid, String upw) {
		Map<String, String> m = new HashMap<>();
		m.put("userid",uid);
		m.put("pwd",upw);
		String pw=session.getMapper(MemberRepository.class).login(m);
		if(upw.equals(pw)) {
			return uid;
		}
		return null;
	}

	@Override
	public void add(Member member) {
		session.getMapper(MemberRepository.class).add(member);
	}

	@Override
	public Member search(String userid) {
		return session.getMapper(MemberRepository.class).search(userid);
	}

	@Override
	public void update(Member member) {
		session.getMapper(MemberRepository.class).update(member);
	}

	@Override
	public void delete(String userid) {
		session.getMapper(MemberRepository.class).delete(userid);
	}

	@Override
	public String findbyphone(String userid, String name, String phone) {
		return session.getMapper(MemberRepository.class).findbyphone(userid, name, phone);
	}
	@Override
	public String findbyemail(String userid, String name, String email) {
		return session.getMapper(MemberRepository.class).findbyemail(userid, name, email);
	}

	@Override
	public List<Member> searchAll() {
		return session.getMapper(MemberRepository.class).searchAll();
	}

}