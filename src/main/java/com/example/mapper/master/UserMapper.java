package com.example.mapper.master;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: shrios
 * @description:
 * @author: Mr.Wang
 * @create: 2019-04-09 13:13
 **/
@Mapper
public interface UserMapper {
    public User findByUserName(String username);
}
