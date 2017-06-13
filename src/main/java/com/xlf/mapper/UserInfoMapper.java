package com.xlf.mapper;

import com.xlf.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * author: xiaoliufu
 * date:   2017/6/5.
 * description: 用户信息表mapper
 */
@Mapper
@Component
public interface UserInfoMapper {
    @Select("select * from user_info where id=#{id}")
    public UserInfo selectUserInfoById(@Param("id") int id);
    @Select("select * from user_info where username=#{userName}")
    public UserInfo selectUserInfoByUserName(@Param("userName") String userName);
}
