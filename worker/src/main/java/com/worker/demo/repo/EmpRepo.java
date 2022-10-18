package com.worker.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worker.demo.entity.EmployeEntity;

public interface EmpRepo extends JpaRepository<EmployeEntity, Integer>{

}
