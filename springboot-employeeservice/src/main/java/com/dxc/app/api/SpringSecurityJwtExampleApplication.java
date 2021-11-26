package com.dxc.app.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dxc.app.entity.Employee;
import com.dxc.app.repository.UserRepository;

@SpringBootApplication
@ComponentScan("com.dxc.app")
@EnableJpaRepositories("com.dxc.app")
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<Employee> users = Stream.of(
                new Employee(101, "mahesh", "HR", "mahesh@gmail.com", 10000.00, "user1", "pwd1"),
                new Employee(102, "masthan", "HR", "msthan@gmail.com", 10001.00, "user2", "pwd2"),
                new Employee(103, "mallesh", "HR", "mallesh@gmail.com", 10002.00, "user3", "pwd3"),
                new Employee(104, "manesh", "HR", "manesh@gmail.com", 10003.00, "user4", "pwd4")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
        
    }

}
