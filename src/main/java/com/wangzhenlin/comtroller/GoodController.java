package com.wangzhenlin.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wangzhenlin.entity.Good;
import com.wangzhenlin.service.GoodService;

@Controller
public class GoodController {


	@Autowired
	GoodService ss;
	
	/**
	 * 列表
	 * @param model
	 * @param name
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("list")
	public String list (Model model,String name,@RequestParam(value="pageNum",defaultValue="1") Integer pageNum){
		PageInfo info = ss.getGoodList(name,pageNum);
		model.addAttribute("info", info);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("name", name);
		return "list";
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("del")
	public String del(int id){
		ss.delGood(id);
		return "redirect:/list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd(){
		return "add";
	}
	
	@RequestMapping("add")
	public String add(Good good){
		ss.addGood(good);
		return "redirect:/list";
	}
	
	
	
}
