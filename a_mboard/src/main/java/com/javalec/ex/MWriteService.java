package com.javalec.ex;

import org.springframework.ui.Model;

import com.javalec.ex.service.MListService;
import com.javalec.ex.service.MService;

public class MWriteService extends MListService implements MService {

	public void execute(Model model) {
		
		Map<String, Object> map = model,asMap();
		
	}
}
