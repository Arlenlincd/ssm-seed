package com.arlin.service.impl;

import com.arlin.dao.UserDao;
import com.arlin.domain.User;
import com.arlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/7/18
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
