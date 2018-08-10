package com.wind.s08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {//applicationCTX역활
	//일반자바 클래스가 아닌. xml대신사용

	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub_admin.id}")
	private String sub_adminId;
	@Value("${sub_admin.pw}")
	private String sub_adminPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer =  
				new PropertySourcesPlaceholderConfigurer();
		Resource[] locations=new Resource[2];
		locations[0] = new ClassPathResource("admin.properties");
		locations[1] = new ClassPathResource("sub_admin.properties");
		configurer.setLocations(locations);
		return configurer;
	}//첫번째 빈을 가져왔다
@Bean	
public AdminConnection adminConfig() {
	AdminConnection adminConnection = new AdminConnection(adminId, adminId);
	adminConnection.setAdminId(adminId);
	adminConnection.setAdminPw(adminPw);
	adminConnection.setSub_adminId(sub_adminId);
	adminConnection.setSub_adminPw(sub_adminPw);
	return adminConnection;
	
	
	
	
}
	
	
	
}
