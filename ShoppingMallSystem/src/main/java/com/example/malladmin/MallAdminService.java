package com.example.malladmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MallAdminService {

@Autowired	
private MallAdminRepository repo;
	
	public List<MallAdmin> listAll() {
		return repo.findAll();
	}
	
	public MallAdmin save(MallAdmin MallAdmin) {
		repo.save(MallAdmin);
		return MallAdmin;
	}
	
	public MallAdmin get(Integer id) {
		return repo.findAll().get(id);
		
	}

	public void delete(Long id) 
	 {
	repo.deleteAll();
	 
	}
}
