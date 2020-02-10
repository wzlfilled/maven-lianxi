package com.wangzhenlin.service;

import com.github.pagehelper.PageInfo;
import com.wangzhenlin.entity.Good;

public interface GoodService {

	/**
	 * 列表
	 * @return
	 */
	PageInfo getGoodList(String name,Integer pageNum);
	
	/**
	 * 删除
	 * @param id
	 */
	void delGood(int id);
	
	/**
	 * 添加
	 * @param good
	 */
	void  addGood(Good good);
	
}
