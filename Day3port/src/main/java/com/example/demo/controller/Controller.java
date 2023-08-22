package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	Service sr;
	@PostMapping("read")
	public Model add(@RequestBody Model mm) {
		return sr.saveinfo(mm);
	}
	@GetMapping("write")
	public List<Model>show(){
		return sr.showinfo();	}
	
}
