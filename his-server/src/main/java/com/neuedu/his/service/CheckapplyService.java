package com.neuedu.his.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.his.po.Checkapply;

import java.util.List;
import java.util.Map;

/**
 * @author root
 * @description 针对表【checkapply】的数据库操作Service
 * @createDate 2025-06-25 10:55:53
 */
public interface CheckapplyService extends IService<Checkapply> {

    public  Map<String,Object> getinfoAndPriceByMedicalID(Integer mid);
}
