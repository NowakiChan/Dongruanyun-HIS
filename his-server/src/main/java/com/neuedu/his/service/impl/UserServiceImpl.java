package com.neuedu.his.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.his.mapper.UserMapper;
import com.neuedu.his.po.User;
import com.neuedu.his.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author root
 * @description 针对表【rule】的数据库操作Service实现
 * @createDate 2025-06-25 10:55:54
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




