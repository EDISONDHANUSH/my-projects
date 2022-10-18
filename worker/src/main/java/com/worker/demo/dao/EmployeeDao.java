package com.worker.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.worker.demo.entity.EmployeEntity;
import com.worker.demo.repo.EmpRepo;

@Repository
public class EmployeeDao {
@Autowired
EmpRepo er;
public String post(EmployeEntity ee) {
	er.save(ee);
	return "Data has been saved successfully";
}
public String post1(List<EmployeEntity> ee) {
	er.saveAll(ee);
	return "bulk of dada saved";
}
public List<EmployeEntity> get(){
	return er.findAll();
	
}
public EmployeEntity getbyid(int a) {
	return er.findById(a).get();
	
}
public String del(int a) {
	 er.deleteById(a);
	 return "delete successfully";
}
public List<EmployeEntity> incre(){
	return er.findAll()
;}
}
