package com.wind.web.dao;

import java.sql.Connection;
import java.util.ArrayList;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.wind.web.dto.BDto;

public class BDao {
	DataSource dataSource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<BDto> list(){
	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto dto;
	Connection connection = null;
	
	
	
	return dtos;

}
	
}
