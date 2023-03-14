package com.tenco.blog;

import com.tenco.blog.controller.AController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDto;

public class MainTest1 {

	public static void main(String[] args) {
		
		// main -> AC -> AS -> AD
		// 결과 받아보기
		// "[[ >> " + msg + " << ]]"
		
		AController ac = new AController();
		String acResult = ac.select("혼자함");
		System.out.println(acResult);
		
		UserController userController = new UserController();
		UserDto responseDto = userController.select(1);
		System.out.println(responseDto);
	}

}
