package com.reactboot.controller;

import java.util.List;

import com.reactboot.model.data;
import com.reactboot.repository.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data")
@ComponentScan("com.reactboot.repository")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping(value = "/all")
    public List<data> findAll() {
        return dataRepository.findAll();
    }

    @PostMapping(value = "/load")
    public data load(@RequestBody final data data) {
        dataRepository.save(data);
        return dataRepository.findByName(data.getGroupName());
    }

}