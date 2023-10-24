package com.P5CMEPPS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.P5CMEPPS.demo.model.Todo;

public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}