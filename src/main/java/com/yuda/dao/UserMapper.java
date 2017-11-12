package com.yuda.dao;

import com.yuda.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface UserMapper {
    int insert(@Param("user") User user);

    int insertSelective(@Param("user") User user);

    int insertList(@Param("users") List<User> users);

    int update(@Param("user") User user);
}
