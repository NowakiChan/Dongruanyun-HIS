package com.neuedu.his.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.his.po.User;
import com.neuedu.his.service.UserService;
import com.neuedu.his.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author mi
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-07-02 09:19:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




