package com.yzw.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	//跳转
	@RequestMapping("list.do")
	public String list() {
		return "list";
	}
	
	//运行
	@RequestMapping("show.do")
	public void show(String html) {
		//判断是否空值
		if (html==null || html=="") {
			System.out.println("不可为空");
		}
		//转换为html格式
		com.yzw.utils.week02utils week02utils=new com.yzw.utils.week02utils();
		String html2 = week02utils.toHtml(html);
		System.out.println(html2);
	}
}
