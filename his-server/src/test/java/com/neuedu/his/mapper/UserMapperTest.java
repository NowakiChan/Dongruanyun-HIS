package com.neuedu.his.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neuedu.his.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 作者: 张金山
 * 创建时间：2025/6/25 9:14   星期三
 * 描述：
 * 项目: his-server - com.neuedu.his.mapper
 * 作者的博客:  https://blog.fulfill.com.cn
 */
@SpringBootTest
class UserMapperTest {
    // AUtowire  从spirng  IOC中获取一个  Useraper
    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectListQueryWrapper() {

        // 查询条件构造器
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        // queryWrapper.like("username","admin");    //  usernmae  like  '%admin%'
        // queryWrapper.likeLeft("username","admin");  //  usernmae  like  '%admin'
        // queryWrapper.likeRight("username","admin");  //  usernmae  like  'admin%'

        queryWrapper.eq("ID", 12);    //  where ID = 12

        // queryWrapper.between("age",18,20);



        // 查询结果
        // select * from user where  id = ?   username like ?
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);


    }


    @Test
    public void testSelectListLambda() {

        // 查询条件构造器
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();


        // queryWrapper.like("username","admin");    //  usernmae  like  '%admin%'
        // queryWrapper.likeLeft("username","admin");  //  usernmae  like  '%admin'
        // queryWrapper.likeRight("username","admin");  //  usernmae  like  'admin%'

        // queryWrapper.eq(User::getID, 1);    //  where ID = 1

        // queryWrapper.between("age",18,20);


        // 查询结果
        // select * from user where  id = ?   username like ?
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);


    }


    @Test
    public void selectById() {
        System.out.println("查询单条");
        Long id = 1L;
        User user = userMapper.selectById(id);
        System.out.println("user = " + user);
    }


    @Test
    public void insert() {


        // 模拟从用户界面录入数据
        User user = new User();

        user.setUserName("MyBatis");
        user.setPassword("123456");
        user.setRealName("MyBatis");
        user.setDeptID(1);
        user.setDelMark(1);

        int count = userMapper.insert(user);
        System.out.println("count = " + count);
    }


    @Test
    public void updateById() {

        Long id = 13L;
        User user = userMapper.selectById(id);
        user.setPassword(user.getPassword() + "#$%&");
        user.setRealName(user.getRealName() + "----");
        // 全量字段更新
        int count = userMapper.updateById(user);

        System.out.println("count = " + count);
    }


    @Test
    public void deleteById() {
        Long id = 13L;
        int count = userMapper.deleteById(id);
        System.out.println("count = " + count);
    }



    @Test
    public void pages(){

        Page<User> page = new Page<>(1, 10);
        Page<User> userPage = userMapper.selectPage(page, null);
        userPage.getRecords().forEach(System.out::println);

        System.out.println("===================================");

        Page<User> page2 = new Page<>(2, 10);
        Page<User> userPage2 = userMapper.selectPage(page2, null);
        userPage2.getRecords().forEach(System.out::println);
    }

}