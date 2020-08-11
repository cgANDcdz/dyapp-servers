package org.icg.dyapp.sso.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.icg.dyapp.sso.pojo.User;

@Mapper
public interface UserMapper {

    Boolean addUser(User user);


}
