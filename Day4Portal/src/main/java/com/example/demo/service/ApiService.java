package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;

@Service
public class ApiService {
	@Autowired
	Repository ac;
	public Model saveinfo(Model mm) {
		return ac.save(mm);
	}
	public List<Model> showinfo(){
		return ac.findAll();
	}
	public Model changeinfo(Model mm) {
		return ac.saveAndFlush(mm);
	}
	public void delete(Model mm) {
		ac.delete(mm);;
	}
	
}
