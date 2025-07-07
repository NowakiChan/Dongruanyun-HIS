package com.neuedu.his.controller;

import com.neuedu.his.service.CheckapplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/check")
public class CheckApplyController {

    @Autowired
    CheckapplyService service;

    @RequestMapping("/getbymid")
    public Map<String,Object> getbymid(@RequestParam Integer mid){
        return service.getinfoAndPriceByMedicalID(mid);
    }
}
