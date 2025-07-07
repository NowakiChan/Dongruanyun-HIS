package com.neuedu.his.controller;

import com.neuedu.his.po.Constanttype;
import com.neuedu.his.service.ConstanttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/ConstantType")
public class ConstantTypeController {
    private static final Logger logger = Logger.getLogger(ConstantTypeController.class.getName());
    @Autowired
    ConstanttypeService service;

    @RequestMapping("/add")
    public Boolean add(@RequestBody Constanttype type){
        return service.save(type);
    }


    @RequestMapping("/list")
    public List<Constanttype> list(){
        return service.list();
    }

    @RequestMapping("/delete/{id}")
    public Boolean delete(@PathVariable String id){
        return service.removeById(id);
    }

    @RequestMapping("/getById/{id}")
    public Constanttype getById(@PathVariable String id){
        return service.getById(id);
    }

    @PostMapping("/update")
    public boolean update(@RequestBody Constanttype constanttype) {

        if (constanttype.getId() == null) {
            System.err.println("【更新失败】ID不能为空");
            return false;
        }

        return service.updateById(constanttype);
    }
}
