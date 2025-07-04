package com.neuedu.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iwen
 */
@RestController
@RequestMapping("/settlecategory")
public class SettleCategoryController {

    @Autowired
    SettlecategoryService service;
    @RequestMapping("/getById/{id}")
    public Settlecategory getById(@PathVariable String id){
        return service.getById(id);
    }

}
