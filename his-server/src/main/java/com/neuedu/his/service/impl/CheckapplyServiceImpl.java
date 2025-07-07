package com.neuedu.his.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.his.mapper.CheckapplyMapper;
import com.neuedu.his.mapper.RegisterMapper;
import com.neuedu.his.po.Checkapply;
import com.neuedu.his.po.Register;
import com.neuedu.his.service.CheckapplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author root
 * @description 针对表【checkapply】的数据库操作Service实现
 * @createDate 2025-06-25 10:55:53
 */
@Service
public class CheckapplyServiceImpl extends ServiceImpl<CheckapplyMapper, Checkapply>
        implements CheckapplyService {

    @Autowired
    CheckapplyMapper checkmapper;

    @Autowired
    RegisterMapper regmapper;
    @Override
    public Map<String,Object> getinfoAndPriceByMedicalID(Integer mid) {
        // 1.查询患者信息
        QueryWrapper<Register> qw = new QueryWrapper<>();
        qw.eq("casenumber",mid);
        Register reg = regmapper.selectOne(qw);
        // 2.查询患者的检验检查信息
        List<Map<String, Object>> list = checkmapper.getinfoByMedicalID(mid);

        // 返回结果
        Map<String,Object> map = new HashMap<>();
        map.put("info",reg);
        map.put("list",list);
        return map;
    }
}




