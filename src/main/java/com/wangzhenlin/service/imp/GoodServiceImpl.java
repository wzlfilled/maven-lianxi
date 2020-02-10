package com.wangzhenlin.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangzhenlin.dao.GoodMapper;
import com.wangzhenlin.entity.Good;
import com.wangzhenlin.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	GoodMapper dao;

	@Override
	public PageInfo getGoodList(String name,Integer pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Good> list = dao.getGoodList(name);
		PageInfo info = new PageInfo<>(list);
		return info;
	}

	@Override
	public void delGood(int id) {
		// TODO Auto-generated method stub
		dao.delGood(id);
	}

	@Override
	public void addGood(Good good) {
		// TODO Auto-generated method stub
		dao.addGood(good);
	}
	
	
	
}
