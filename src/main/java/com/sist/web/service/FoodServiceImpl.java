package com.sist.web.service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;

import com.sist.web.mapper.*;
@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService{
	private final FoodMapper fMapper;

	@Override
	public List<FoodVO> foodListData(int start) {
		// TODO Auto-generated method stub
		return fMapper.foodListData(start);
	}

	@Override
	public int foodTotalPage() {
		// TODO Auto-generated method stub
		return fMapper.foodTotalPage();
	}

	@Override
	public FoodVO foodDetailData(int no) {
		// TODO Auto-generated method stub
		return fMapper.foodDetailData(no);
	}

	@Override
	public int[] foodPages(int page) {
		// TODO Auto-generated method stub
		return null;
	}
}
