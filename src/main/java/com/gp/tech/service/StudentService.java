package com.gp.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.tech.repository.StudentOrderRepository;

@Service
public class StudentService {

	@Autowired
	private StudentOrderRepository studentorderrepo;
	
	
}
