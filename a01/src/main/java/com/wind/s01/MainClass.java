package com.wind.s01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//			AbstractApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.load("classpath:applicationCTX.xml");
			ctx.refresh();
			
			Student student = ctx.getBean("student", Student.class);
		
				System.out.println("이름1 : " + student.getName());
				System.out.println("나이1 : " + student.getAge());
				
				ctx.close();
			}
		
				
			
		}
	