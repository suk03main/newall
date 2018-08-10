package com.wind.web.dao;

import java.util.ArrayList;

import com.wind.web.dto.VetspecialtiesDto;

public interface VetSpecialtiesDao {
	public void vetspec_deleteDao(String id);
	public void add_vetstec(String vet_id,String specialty_id);
	public ArrayList<VetspecialtiesDto>VetspecialtiesDao();

}
