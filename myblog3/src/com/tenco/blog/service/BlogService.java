package com.tenco.blog.service;

import com.tenco.blog.dao.BlogDao;
import com.tenco.blog.dto.BlogDto;

public class BlogService {
	
	private BlogDao blogDao;
	
	public BlogService() {
		blogDao = new BlogDao();
	}

	public BlogDto selectByBoardId(int id) {
		BlogDto resultDto = blogDao.select(id);
		return resultDto;
	}
	
	public int deleteBoardById(int boardId, int userId) {
		int resultRow = 0;
		
		BlogDto blogDto = selectByBoardId(boardId);
		if(blogDto != null) {
			int blogWriterId = blogDto.getUserId();
			if(blogWriterId == userId) {
				resultRow = blogDao.delete(boardId);
			}
		}
		
		return resultRow;
	}

}
