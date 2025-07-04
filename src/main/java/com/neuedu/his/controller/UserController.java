package com.neuedu.his.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neuedu.his.po.User;
import com.neuedu.his.service.UserService;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list(){
        LambdaQueryWrapper <User> queryWrapper = new LambdaQueryWrapper<>();
        List list = userService.list(queryWrapper);
        return list;
    }


    @RequestMapping("/login")
    public Integer login(@RequestParam String username,@RequestParam String password){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("username",username).eq("password",password);
        List<User> users = userService.list(qw);
        if(users==null || users.size()==0)
            return -1;
        else
            return users.get(0).getId();
    }

    @RequestMapping("/saveOrUpdate")
    public boolean saveOrUpdate(User user){

        return userService.saveOrUpdate(user);
    }

    @RequestMapping("/getById/{id}")
    public User getById(@PathVariable  String id){
        return userService.getById(id);
    }

    @RequestMapping("/getbydeptid")
    public List<User> getbydeptid(@RequestParam Integer deptid){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("deptid",deptid).eq("usetype",3);
        return userService.list(qw);
    }

    @RequestMapping("/getbyuserid")
    public List<User> getbyuserid(@RequestParam Integer userid){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("id",userid).eq("usetype",3);
        return userService.list(qw);
    }

    /**
     *  http://localhost:8080/user/deleteById/100
     *  http://localhost:8080/user/deleteById/100
     *  http://localhost:8080/user/deleteById/100
     */
    @RequestMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable String id){
        return userService.removeById(id);
    }
}
