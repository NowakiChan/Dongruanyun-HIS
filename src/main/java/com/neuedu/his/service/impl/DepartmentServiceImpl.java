package com.neuedu.his.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.his.po.Department;
import com.neuedu.his.service.DepartmentService;
import com.neuedu.his.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author mi
* @description 针对表【department】的数据库操作Service实现
* @createDate 2025-07-02 09:19:54
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




