package com.neuedu.his.mapper;

import com.neuedu.his.po.Drugs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 作者: 张金山
 * 创建时间：2025/6/25 10:58   星期三
 * 描述：
 * 项目: his-server - com.neuedu.his.mapper
 * 作者的博客:  https://blog.fulfill.com.cn
 */
@SpringBootTest
class DrugsMapperTest {

    @Autowired
    private DrugsMapper drugsMapper;


    @Test
    public void test(){
        List<Drugs> drugs = drugsMapper.selectList(null);
        drugs.forEach(System.out::println);
    }

}