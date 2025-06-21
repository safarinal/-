package com.df.bbt.mapper;

import com.df.bbt.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface UserMapper {

    //根据传入的User，查找相应的name
    public String getName(User user);

    //根据传入的account 查找是否存在
    public int judgeAccount(String account);

    //进行注册功能
    public int registUser(User user);

    //根据用户id找到
    public User getUserById(Integer userId);

    //修改User的值
    public int updateUser(User user);
}
