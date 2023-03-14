package com.tenco.blog.controller;

import com.tenco.blog.dto.BlogDto;
import com.tenco.blog.service.BlogService;

public class BlogController {
	
	private BlogService blogService;
	
	public BlogController() {
		blogService = new BlogService();
	}
	
	public BlogDto requestBoardContentById(int id) {
		BlogDto responseDto = blogService.selectByBoardId(id);
		return responseDto;
	}

}
