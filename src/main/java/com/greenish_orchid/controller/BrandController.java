package com.greenish_orchid.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.greenish_orchid.model.Movie;
import com.greenish_orchid.service.BrandService;

/**
 * @author CFC
 *
 *	时间2019年9月4日
 */
@Controller
public class BrandController {

	@Resource
	private BrandService se;
	
	@RequestMapping("list.do")
	public String list(String mname,@RequestParam(required=false,defaultValue="1")Integer pageNum,Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mname", mname);
		PageHelper pageHelper = new PageHelper();
		pageHelper.startPage(pageNum, 2);
		List<Movie> list = se.queryAllMovie(map);
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		model.addAttribute("page", page);
		return "list";
	}
}
