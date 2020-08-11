package org.icg.dyapp.sso.service;

import org.icg.dyapp.sso.mapper.UserMapper;
import org.icg.dyapp.sso.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 注册时添加用户
     * @param email
     * @param password
     * @return
     */
    public Boolean addUser(String email,String password){
        User user=new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setCreated(new Date());                 //自动添加创建时间
        return this.userMapper.addUser(user);
    }

}
