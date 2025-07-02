package com.neuedu.his.controller;

import com.neuedu.his.po.Constanttype;
import com.neuedu.his.service.ConstanttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/constanttype")
public class ConstantTypeController {

    @Autowired
    ConstanttypeService service;


    @RequestMapping("/add")
    public Boolean add(@RequestBody  Constanttype type){
        return service.save(type);
    }


    @RequestMapping("/list")
    public List<Constanttype> list(){
        return service.list();
    }
}
