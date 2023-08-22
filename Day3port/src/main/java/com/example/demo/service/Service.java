package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repository re;
	public Model saveinfo(Model mm) {
		return re.save(mm);
	}
	public List<Model>showinfo(){
		return re.findAll();
	}

}
