package com.worker.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worker.demo.dao.EmployeeDao;
import com.worker.demo.entity.EmployeEntity;

@Service
public class EmployeService {
@Autowired
	EmployeeDao ed;
public String post(EmployeEntity ee) {
	return ed.post(ee);
}
public String post1(List<EmployeEntity> ee) {
	return ed.post1(ee);
}
public List<EmployeEntity> get(){
	return ed.get();
}
public EmployeEntity getbtid(int a) {
	return ed.getbyid(a);
}
public String del(int a) {
	return ed.del(a);
}
public List<EmployeEntity> incre(){
	List<EmployeEntity> li=ed.incre();
	for(EmployeEntity be:li) {
		be.setEmpSalary(be.getEmpSalary()+5000);
	}
	return li;
}
}
