package com.example.mall;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MallService {
	@Autowired
	private MallRepository repo;

	public List<Mall> listAll() {
		return repo.findAll();
	}

	public Mall save(Mall mall) {
		repo.save(mall);
		return mall;
	}

	public Mall get(Integer id) {
		Mall mall = repo.findById(id).get();
		return mall;
	}

	public Mall delete(Integer id) {
		Mall mall = repo.findById(id).get();
		repo.deleteById(id);
		return mall;
	}
}