package com.tenco.blog.service;

import com.tenco.blog.controller.AController;
import com.tenco.blog.dao.ADao;

public class AService {
	
	private ADao aDao;
	
	public AService() {
		aDao = new ADao();
	}

	public String select(String msg) {
		// AS(null) ---> AC(null)
		String result2 = aDao.select(msg);
		return result2;
	}
}
