package com.wind.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.dao.IDao;
import com.wind.web.dto.VetsDto;
import com.wind.web.dto.VetspecialtiesDto;

@Controller
public class VetsController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/vetslist")
	public String vetslist(Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("vetslist",dao.vetslistDao());
		
		
		return "vetslist";
	}
	@RequestMapping("/vetselect_view")
	 public String vetselect_view(HttpServletRequest request, Model model) {
	  IDao dao = sqlSession.getMapper(IDao.class);
	  model.addAttribute("vetselect_view", dao.vetselect_viewDao());
	  return "vetselect_view";
	}


	@RequestMapping("/vetselect2")
	public String vetselect(HttpServletRequest request, Model model) {
	  IDao dao = sqlSession.getMapper(IDao.class);
	 // model.addAttribute("vetselect", dao.vetselectDao(Integer.parseInt(request.getParameter("specialty_id"))));
	  ArrayList<VetspecialtiesDto> dto;
	  dto = dao.vetselectDao(Integer.parseInt(request.getParameter("specialty_id")));

	  ArrayList dto2 = new ArrayList<Integer>();
	  for(int i=0;i<dto.size();i++) {
	    dto2.add(dao.vetselectDao(dto.get(i).getVet_id()));
	  }
	  model.addAttribute("vetselect2", dto2);
	  return "vetselect2";
	}

	@RequestMapping("/vetselect3")
	public String vetselect3(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("vetselect3", 
	dao.vetselect3Dao(Integer.parseInt(request.getParameter("specialty_id"))));
		return "vetselect3";
	}

}


	
	

