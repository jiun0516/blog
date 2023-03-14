package com.tenco.blog;

import com.tenco.blog.controller.BlogController;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		BlogController blogController = new BlogController();
		
		int result = blogController.requestDeleteBoardById(3, 1);
		System.out.println(result);
		
	}
	

}
