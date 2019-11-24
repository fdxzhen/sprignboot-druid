package com.zhenhao.dao;


import com.zhenhao.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao{

    @Select("select * from user where id=#{id}")
    User findById(int id);

    @Insert("insert into user(username) values(#{username})")
    void save(User user);
}