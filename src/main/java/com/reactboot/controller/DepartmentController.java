package com.reactboot.controller;

import com.reactboot.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/department")
@ComponentScan("com.reactboot.repository")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

}