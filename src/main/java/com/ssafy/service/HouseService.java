package com.ssafy.service;

import java.util.List;

import com.ssafy.dto.HouseDealDto;

public interface HouseService {
	
	List<HouseDealDto> searchByGugun(String text);
	
	List<HouseDealDto> searchByDong(String text);
	
	List<HouseDealDto> searchByaptName(String text);

	List<HouseDealDto> searchAll();
	
	HouseDealDto searchByNo(int no);
}
