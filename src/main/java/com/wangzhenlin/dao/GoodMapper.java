package com.wangzhenlin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.entity.Good;

public interface GoodMapper {

	/**
	 * 列表
	 * @return
	 */
	List<Good> getGoodList(@Param("name")String name);
	
	/**
	 * 删除
	 * @param id
	 */
	void delGood(@Param("id")int id);
	
	/**
	 * 添加
	 * @param good
	 */
	void  addGood(Good good);
	
}
