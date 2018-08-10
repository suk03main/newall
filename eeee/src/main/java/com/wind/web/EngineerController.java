package com.wind.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.dao.IDao;
import com.wind.web.dto.Engineer_Major;
import com.wind.web.dto.major;

@Controller
public class EngineerController {

		@Autowired
		private SqlSession sqlSession;
		
		@RequestMapping("/engineerlist")
		public String vetslist(Model model) {
			IDao dao = sqlSession.getMapper(IDao.class);
			model.addAttribute("engineerlist", dao.engineerlistDao());
			return "engineerlist";
		}

		@RequestMapping("/engineerselect_view")
		public String engineerselect_view(Model model) {
			IDao dao = sqlSession.getMapper(IDao.class);
			model.addAttribute("engineerselect_view", dao.engineerselect_viewDao());
			return "engineerselect_view";
		}
		
		@ExceptionHandler
		public String HandlerExecution(Exception e) {
			return "viewerror";
		}
		
		
		@RequestMapping("/engineerselect")
		public String engineerselect(HttpServletRequest request, Model model) {
			IDao dao = sqlSession.getMapper(IDao.class);
			model.addAttribute("engineerselect", dao.engineerselectDao
				(Integer.parseInt(request.getParameter("major_id"))));
			
			ArrayList<Engineer_Major> dto; 
			dto = dao.engineerselectDao
					(Integer.parseInt(request.getParameter("major_id")));
			
			ArrayList<major> dto2 = new ArrayList<major>();
			
			for(int i=0; i<dto.size();i++) {
				dto2.add(dao.engineerselect2Dao(dto.get(i).getEngineer_id()));
//				System.out.println("engineer_id = "+dto.get(i).getEngineer());
			}
			model.addAttribute("engineerselect", dto2);
			return "engineerselect";
		}
		
		
	}

