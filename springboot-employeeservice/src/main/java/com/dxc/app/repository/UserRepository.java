package com.dxc.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.app.entity.Employee;

public interface UserRepository extends JpaRepository<Employee,Integer> {
    Employee findByUserName(String username);
    List<Employee> findAll();
}
