package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.dto.BlogDto;

public class MainTest1 {

	public static void main(String[] args) {

		BlogController blogController = new BlogController();
		BlogDto dto = blogController.requestBoardContentById(3);
		System.out.println(dto);

	}

}
