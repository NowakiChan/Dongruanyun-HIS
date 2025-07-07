package com.neuedu.his.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neuedu.his.po.Constantitem;
import com.neuedu.his.po.User;
import com.neuedu.his.service.ConstantitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ConstantItem")
public class ConstantItemController {

    @Autowired
    ConstantitemService service;

    @RequestMapping("/list")
    public List<Constantitem> list(){
        return  service.list();
    }

    @RequestMapping("/getbytypeid")
    public List<Constantitem> getbytypeid(@RequestBody Map<String,String>id){
        LambdaQueryWrapper<Constantitem> queryWrapper = new LambdaQueryWrapper<>();
        System.out.println(id.get("id"));
        queryWrapper.eq(Constantitem::getConstanttypeid,Integer.parseInt(id.get("id")));
        return service.list(queryWrapper);
    }

    @RequestMapping("/getbytypeid2")
    public List<Constantitem> getbytypeid2(@RequestParam Integer id){
        System.out.println("getbytypeid2   id="+id);
        QueryWrapper<Constantitem> qw = new QueryWrapper<>();
        qw.eq("constanttypeid",id);
        return service.list(qw);
    }
    @RequestMapping("/delete/{id}")
    public Boolean delete(@PathVariable String id){
        return service.removeById(id);
    }

    @RequestMapping("/add")
    public Boolean add(@RequestBody Constantitem type){
        return service.save(type);
    }
    @PostMapping("/update")
    public boolean update(@RequestBody Constantitem constantitem) {

        if (constantitem.getId() == null) {
            System.err.println("【更新失败】ID不能为空");
            return false;
        }

        return service.updateById(constantitem);
    }
}
