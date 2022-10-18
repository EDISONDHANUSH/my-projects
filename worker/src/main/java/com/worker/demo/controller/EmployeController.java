package com.worker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.worker.demo.entity.EmployeEntity;
import com.worker.demo.service.EmployeService;

@RestController

public class EmployeController {
	@Autowired
	EmployeService es;
	@PostMapping(value="add")
	public String post(@RequestBody EmployeEntity ee) {
		return es.post(ee);
	}
	@PostMapping(value="addfull")
	public String post1(@RequestBody List<EmployeEntity> ee) {
		return es.post1(ee);
	}
	@GetMapping(value="getfull")
	public List<EmployeEntity>get(){
		return es.get();
	}
	@GetMapping(value="/getby/{a}")
	public EmployeEntity getbyid(@PathVariable int a) {
		return es.getbtid(a);
	}
	@DeleteMapping(value="/del/{a}")
	public String del(@PathVariable int a) {
		return es.del(a);
	}
	@GetMapping(value="inc")
	public List<EmployeEntity> incre(){
		return es.incre();
	}

}
