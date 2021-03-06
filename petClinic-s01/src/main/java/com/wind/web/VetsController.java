package com.wind.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.dao.SpecialtiesDao;
import com.wind.web.dao.VetSpecialtiesDao;
import com.wind.web.dao.VetsDao;
import com.wind.web.dto.VetsDto;
import com.wind.web.dto.VetspecialtiesDto;

@Controller
public class VetsController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/vetslist")
	public String vetslist(Model model) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		model.addAttribute("vetslist", dao.vetslistDao());
		return "vetslist";
	}
/*	@RequestMapping("/vetslistall")
	public String vetslistall(Model model) {
		
		//model:
		//vetslist:의사정보(id,first_name,last_name)
		//vetsecslist-의사ID와 전공ID 매핑(vet_id,specialty_id)
		//specialtieslist:전공(id,name)
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		
		VetspecialtiesDao vsdao = sqlSession.getMapper(vetspecialtiesDao.class);
		SpecialtiesDao sdao =sqlSession.getMapper(SpecialtiesDao.class);
	
		model.addAttribute("vetslist", dao.vetslistDao());
		model.addAttribute("vetspeslist", dao.vetspeslistDao());
		
		return "vetslistall";
	}*/
	
	
	
	
	
	
	@RequestMapping("/vetselect_view")
	public String vetselect_view(Model model) {
		SpecialtiesDao dao = sqlSession.getMapper(SpecialtiesDao.class);
		model.addAttribute("vetselect_view", dao.vetselect_viewDao());
		return "vetselect_view";
	}
	
	@RequestMapping("/vetselect")
	public String vetselect(HttpServletRequest request, Model model) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		model.addAttribute("vetselect", dao.vetselectDao
			(Integer.parseInt(request.getParameter("specialty_id"))));
		
		ArrayList<VetspecialtiesDto> dto; // dto ... {4,5,8}..dto.get(0)
		dto = dao.vetselectDao
				(Integer.parseInt(request.getParameter("specialty_id")));
		
		ArrayList<VetsDto> dto2 = new ArrayList<VetsDto>();
		
		for(int i=0; i<dto.size();i++) {
			dto2.add(dao.vetselect2Dao(dto.get(i).getVet_id()));
//			System.out.println("vets_id = "+dto.get(i).getVet_id());
		}
		model.addAttribute("vetselect2", dto2);
		return "vetselect";
	}
	
	@RequestMapping("/vetselect3")
	public String vetselect3(HttpServletRequest request, Model model) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		model.addAttribute("vetselect3", dao.vetselect3Dao(
			Integer.parseInt(request.getParameter("specialty_id"))));
		
		return "vetselect3";
	}
	
	@RequestMapping("/vet_add_view")
	public String vet_add_view() {
		return "vet_add_view";
	}
	
	@RequestMapping("/vet_add")
	public String vet_add(HttpServletRequest request) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		dao.vet_addDao(request.getParameter("first_name"), 
				request.getParameter("last_name"));
		
		return "redirect:vetslist";
	}
	
	@RequestMapping("/vet_add_major")
	public String vet_add_major(Model model) {
		VetsDao dao1 = sqlSession.getMapper(VetsDao.class);
		SpecialtiesDao dao2 = sqlSession.getMapper(SpecialtiesDao.class);
		model.addAttribute("vetslist",dao1.vetslistDao());
		model.addAttribute("specialtieslist", dao2.specialtieslistDao());
		
		return "vet_add_major";
	}
	
	@RequestMapping("/vet_add_major_mod")
	//vet_id=6&major=1&major=2
	public String vet_add_major_mod(HttpServletRequest request, Model model) {
		String vet_id = request.getParameter("vet_id");
		String[] major = request.getParameterValues("major");
		
		del_vetspec(vet_id);
		
		for(int i=0; i<major.length; i++) {
		//add_vetspec(vet_id, major[i]);
		}
		
		return "redirect:vetslist";
	}
	
	public void del_vetspec(String vet_id){
		// VetspecialtiesDao 만들고
		// vetspec_deleteDao(vet_id) 생성
		VetSpecialtiesDao dao= sqlSession.getMapper(VetSpecialtiesDao.class);
		//dao.vetspec_deleteDao(vet_id);
		
	}
	
	
	
	
	@ExceptionHandler
	public String handlerException(Exception e) {
		return "viewerror";
	}
	
	
}
