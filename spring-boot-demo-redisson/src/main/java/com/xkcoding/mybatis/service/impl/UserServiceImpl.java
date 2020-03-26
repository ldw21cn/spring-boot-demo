package com.xkcoding.mybatis.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xkcoding.mybatis.entity.User;
import com.xkcoding.mybatis.mapper.UserMapper;
import com.xkcoding.mybatis.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author daweilv
 * @since 2020-03-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
