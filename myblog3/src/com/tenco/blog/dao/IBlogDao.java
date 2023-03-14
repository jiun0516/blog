package com.tenco.blog.dao;

import com.tenco.blog.dto.BlogDto;

public interface IBlogDao {
	
	void select();
	BlogDto select(int id);
	int delete(int boardId);

}
