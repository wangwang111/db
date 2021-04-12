package com.wang.moredatasource.dao.master;

import com.wang.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import tk.mybatis.mapper.common.Mapper;

@Qualifier("db1SqlSessionTemplate")
public interface UserDao extends Mapper<User> {
    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);

}