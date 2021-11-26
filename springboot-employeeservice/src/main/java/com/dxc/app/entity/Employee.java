package com.dxc.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMP_TBL")
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;
    private String email;
    private double salary;
    private String username;
    private String password;
    
    
}
