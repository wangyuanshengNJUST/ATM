package com.text.service.impl;

import com.text.dao.UserDao;
import com.text.po.User;
import com.text.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王元圣
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String selectUserByUsername(String username) {
        return userDao.selectUserByUsername(username);
    }

    @Override
    public int selesttypeByUsername(String username) {
        return userDao.selesttypeByUsername(username);
    }

    @Override
    public void updateType(String username) {
        userDao.updateType(username);
    }
}
