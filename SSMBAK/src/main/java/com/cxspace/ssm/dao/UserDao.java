package com.cxspace.ssm.dao;

import com.cxspace.ssm.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liujie on 2017/8/12.
 */
public interface UserDao extends BaseDao<User>{

    public Integer save(User user);

    public List<User> findUserByUserPhone(String phone);

    public List<User> findUserByUserPhoneAndPassword(@Param("phone") String phone , @Param("password")String password);

    public Integer updateUserEmailByIdAndEmail(@Param("email")String email , @Param("id")String id);

    public Integer updateUserPasswordByIdAndPassword(@Param("password")String password , @Param("id")String id);

    public Integer updateUserImgsrcByUserIdAndImgsrc(@Param("imgsrc")String imgsrc , @Param("id")String id);

    public Integer updateUserNameByUserIdAndName(@Param("name")String name , @Param("id")String id);

    public void prohibitUserById(String id);

    public void activeUserById(String id);

}
