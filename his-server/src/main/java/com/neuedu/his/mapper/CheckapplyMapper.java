package com.neuedu.his.mapper;

import com.neuedu.his.po.Checkapply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @author root
 * @description 针对表【checkapply】的数据库操作Mapper
 * @createDate 2025-06-25 10:55:53
 * @Entity com.neuedu.his.po.Checkapply
 */
public interface CheckapplyMapper extends BaseMapper<Checkapply> {

    @MapKey("getinfoByMedicalID")
    public List<Map<String,Object>> getinfoByMedicalID(int id);
}




