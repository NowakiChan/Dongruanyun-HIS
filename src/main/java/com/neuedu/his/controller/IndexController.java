package com.neuedu.his.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者: 张金山
 * 创建时间：2025/6/24 11:17   星期二
 * 描述： 欢迎信息
 * 项目: his-server - com.neuedu.his.controller
 * 作者的博客:  https://blog.fulfill.com.cn
 */
@RestController
public class IndexController {


    /**
     * 访问  url  ， 获取 数据  json  string:  success
     * http://localhost:8080/index
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {

        return "success";
    }

    /**
     * * http://localhost:8080/json
     *
     * @return
     */
    @RequestMapping("/json")
    public List json() {

        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Map row = new HashMap();
            row.put("id", i);
            row.put("name", "name" + i);
            row.put("address", "address" + i);
            list.add(row);
        }
        return list;
    }

}
