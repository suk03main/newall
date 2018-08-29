package com.javalec.ex.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.javalec.ex.dao.dto.Dao;
import com.javalec.ex.dao.dto.Dto;

public class MListService implements MService {
	@Autowired
	@Override
	public void excute(Model model) {
		Dao dao = new Dao();
		ArrayList<Dto> dtos =dao.list();
		model.addAttribute("list",dtos);
	
		
	}

	

}
