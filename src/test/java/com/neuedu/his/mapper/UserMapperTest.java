package com.neuedu.his.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neuedu.his.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    //Autowire 从spring IOC中获取一个Useraper
    @Autowired
    private UserMapper userMapper;
    @Test
    public void selectById() {
        System.out.println("查询单条");
        Long id = 1L;
        User user = userMapper.selectById(id);
        System.out.println("user = " + user);
    }
    @Test
    public void insert() {
        User user = new User();
        user.setUsername("123admin");
        user.setPassword("123456");
        user.setRealname("MyBatis");
        user.setDeptid(1);
        user.setDelmark(1);
        int count = userMapper.insert(user);
        System.out.println("count = " + count);
    }
    @Test
    public void updateById() {
        Long id = 13L;
        User user = userMapper.selectById(id);
        user.setPassword(user.getPassword() + "#$%&");
        user.setRealname(user.getRealname() + "----");
        int count = userMapper.updateById(user);
        System.out.println("count = " + count);
    }
    @Test
    public void deleteById() {
        Long id = 16L;
        int count = userMapper.deleteById(id);
        System.out.println("count = " + count);
    }
    @Test
    public void testSelectListLambda() {
        LambdaQueryWrapper<User> lambdaWrapper = new LambdaQueryWrapper<>();
        lambdaWrapper.like(User::getUsername,"admin");
        List<User> users = userMapper.selectList(lambdaWrapper);
        users.forEach(System.out::println);
    }
    @Test
    public void testSelectListQueryWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username","admin"); //username like '%admin%'
        queryWrapper.or().likeLeft("username","admin"); //username like '%admin'
        queryWrapper.likeRight("username","admin"); //username like 'admin%'
//        queryWrapper.eq("ID",1); //where ID = 1

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
}