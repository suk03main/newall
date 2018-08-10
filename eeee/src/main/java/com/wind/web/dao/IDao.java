package com.wind.web.dao;
import java.util.ArrayList;

import com.wind.web.dto.ContentDto;
import com.wind.web.dto.EngineerDto;
import com.wind.web.dto.Engineer_Major;
import com.wind.web.dto.major;

public interface IDao {

	public ArrayList<major> engineerlistDao();
	public ArrayList<EngineerDto> engineerselect_viewDao();
	public ArrayList<Engineer_Major> engineerselectDao(int major_id);
	public major engineerselect2Dao(int id);
	
	
	
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String bName, String bTitle, String bContent);
	public ContentDto viewDao(String bId);
	public void deleteDao(String bId);
	public void modifyDao(String bName, String bTitle, String bContent, String bId);
	public void replyDao(     String bName, String bTitle, String bContent, int bGroup, int bStep, int bIndent);
	public ContentDto reply_viewDao(String bId);
	public void replyShape(String bGroup, String bStep);
	public void upHit(String bId);
	public Object engineerselect_viewDao1();
	//public Object engineerselect_viewDao();
}
