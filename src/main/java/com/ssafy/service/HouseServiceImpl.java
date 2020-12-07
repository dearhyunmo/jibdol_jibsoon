package com.ssafy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.dto.HouseDealDto;
import com.ssafy.repository.HouseRepository;

@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	private SqlSession session;

	public List<HouseDealDto> searchByGugun(String text) {
//		System.out.println(session.getMapper(HouseRepository.class).searchByGugun(text));
		return session.getMapper(HouseRepository.class).searchByGugun(text);

	}

	public List<HouseDealDto> searchByDong(String text) {
		System.out.println(session.getMapper(HouseRepository.class).searchByDong(text));
		return session.getMapper(HouseRepository.class).searchByDong(text);
	}

	public List<HouseDealDto> searchByaptName(String text) {
		System.out.println(session.getMapper(HouseRepository.class).searchByaptName(text));
		return session.getMapper(HouseRepository.class).searchByaptName(text);

	}

	@Override
	public List<HouseDealDto> searchAll() {
//		System.out.println( session.getMapper(HouseRepository.class).searchAll());
		return session.getMapper(HouseRepository.class).searchAll();
	}

	@Override
	public HouseDealDto searchByNo(int no) {
		return session.getMapper(HouseRepository.class).searchByNo(no);
	}

}
