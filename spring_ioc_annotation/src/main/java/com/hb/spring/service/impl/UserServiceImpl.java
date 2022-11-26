package com.hb.spring.service.impl;


import com.hb.spring.dao.UserDao;
import com.hb.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //@Qualifier("userDaoImpl")
    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
