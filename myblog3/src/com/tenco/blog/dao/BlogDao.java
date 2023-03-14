package com.tenco.blog.dao;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.BlogDto;
import com.tenco.blog.utils.DbHelper;

public class BlogDao implements IBlogDao {
	
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Connection conn;
	
	public BlogDao() {
		conn = DbHelper.getInstance().getConnection();
	}

	@Override
	public void select() {
		
	}

	@Override
	public BlogDto select(int id) {
		
		BlogDto blogDto = null;
		
		String query = " SELECT * "
				+ "FROM board "
				+ "WHERE id = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				blogDto = new BlogDto();
				blogDto.setId( rs.getInt("id") );
				blogDto.setTitle( rs.getString("title") );
				blogDto.setContent( rs.getString("content") );
				blogDto.setReadCount( rs.getInt("readCount") );
				blogDto.setUserId( rs.getInt("userId") );
			}
		} catch (SQLException e) {
			System.out.println(" >> BlogDao select(int id) 에러 발생 << ");
			e.printStackTrace();
		}
		return blogDto;
	}
	

}
