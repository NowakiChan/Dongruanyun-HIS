package com.neuedu.his.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neuedu.his.po.User;
import com.neuedu.his.service.UserService;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 作者: 张金山
 * 创建时间：2025/6/26 8:49   星期四
 * 描述：
 * 项目: his-server - com.neuedu.his.controller
 * 作者的博客:  https://blog.fulfill.com.cn
 * Controller
 *
 *  service --业务层
 *
 *  dao(Mapper)  -- JDBC
 */
@RestController
@RequestMapping("/user")
public class UserController {


    /**
     * 从容器中获取对象
     */
    @Autowired
    private UserService userService;

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

    /**
     * http://localhost:8080/user/list
     * @return
     */
    @RequestMapping("/list")
    public List<User> list(){

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        List list = userService.list(queryWrapper);

        return list;
    }

    /**
     *  添加后修改
     *  Post 请求
     * http://localhost:8080/user/saveOrUpdate
     * @return
     */
    @RequestMapping("/saveOrUpdate")
    public boolean saveOrUpdate(@RequestBody  User user){
        boolean success = userService.saveOrUpdate(user);

        return success;
    }



    /**
     *  http://localhost:8080/user/getById/100
     *  http://localhost:8080/user/getById/100
     *  http://localhost:8080/user/getById/100
     */
    @RequestMapping("/getById/{id}")
    public User getById(@PathVariable  String id){
        User user  = userService.getById(id);
        return user;
    }



    /**
     *  http://localhost:8080/user/deleteById/100
     *  http://localhost:8080/user/deleteById/100
     *  http://localhost:8080/user/deleteById/100
     */
    @RequestMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable  String id){
        boolean success = userService.removeById(id);
        return success;
    }


    @RequestMapping("/getbydeptid")
    public List<User> getbydeptid(@RequestParam Integer deptid){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("deptid",deptid).eq("usetype",3);
        return userService.list(qw);
    }
}
