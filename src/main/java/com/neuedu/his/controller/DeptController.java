package com.neuedu.his.controller;

import com.neuedu.his.po.Department;
import com.neuedu.his.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DepartmentService service;

    @RequestMapping("/list")
    public List<Department> list(){
        return service.list();
    }
}
