package com.ssafy.repository;

import java.util.List;

import com.ssafy.dto.HouseDealDto;

public interface HouseRepository {

	List<HouseDealDto> searchAll();
	
	List<HouseDealDto> searchByGugun(String text);
	
	List<HouseDealDto> searchByDong(String text);
	
	List<HouseDealDto> searchByaptName(String text);
	
	HouseDealDto searchByNo(int no);
}
