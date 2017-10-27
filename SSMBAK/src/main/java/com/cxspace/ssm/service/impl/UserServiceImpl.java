package com.cxspace.ssm.service.impl;

import com.cxspace.ssm.dao.UserDao;
import com.cxspace.ssm.model.Page;
import com.cxspace.ssm.model.User;
import com.cxspace.ssm.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liujie on 2017/8/12.
 */


@Service("userServiceImpl")

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void prohibitUserById(String id) {
        userDao.prohibitUserById(id);
    }

    public void activeUserById(String id) {
        userDao.activeUserById(id);
    }

    public Integer register(User user) {
        return userDao.save(user);
    }

    public List<User> findUserByUserPhone(String phone) {
        return userDao.findUserByUserPhone(phone);
    }

    public List<User> login(String phone, String password) {
        return userDao.findUserByUserPhoneAndPassword(phone,password);
    }

    public Integer updateUserEmail(String email, String id) {
        return userDao.updateUserEmailByIdAndEmail(email,id);
    }

    public Integer updateUserPassword(String password, String id) {
        return userDao.updateUserPasswordByIdAndPassword(password,id);
    }

    public Integer updateUserImgsrc(String imgsrc, String id) {
        return userDao.updateUserImgsrcByUserIdAndImgsrc(imgsrc, id);
    }

    public Integer updateUserName(String name, String id) {
        return userDao.updateUserNameByUserIdAndName(name,id);
    }

    public int insert(User entity) throws Exception {
        return 0;
    }

    public int update(User entity) throws Exception {
        return 0;
    }

    public int delete(User entity) throws Exception {
        return 0;
    }

    public User select(User entity) throws Exception {
        return userDao.select(entity);
    }

    public List<User> selectAll() {
        return userDao.selectAll();
    }

    public Page<User> selectPage(Page<User> page) {
        return null;
    }

    public Page<User> selectPageUseDyc(Page<User> page) {
        return null;
    }

    public int insertDynamic(@Param("items") User entity, @Param("tableName") String tableName) {
        return 0;
    }

    public Page<User> selectPageListDynamic(@Param("pages") Page<User> page, @Param("tableName") String tableName) {
        return null;
    }

    public int selectPageCountDynamic(@Param("tableName") String tableName) {
        return 0;
    }

    public int deleteDynamic(@Param("tablesName") String tableName, @Param("items") User entity) {
        return 0;
    }

    public int updateDynamic(@Param("tableName") String tableName, @Param("items") User entity) {
        return 0;
    }

    public User selectDynamic(@Param("tableName") String table, @Param("items") User entity) {
        return null;
    }



}
