package com.neuedu.his.controller;

import com.neuedu.his.po.Register;
import com.neuedu.his.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService service;

    @RequestMapping("/add")
    public Boolean add(@RequestBody Register r){
        r.setRegisttime(new Date());
        r.setVisitstate(1);
        System.out.println(r);
        return service.save(r);
    }
}
