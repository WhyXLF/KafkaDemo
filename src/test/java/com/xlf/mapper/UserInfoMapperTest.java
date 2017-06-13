package com.xlf.mapper;

import com.xlf.Application;
import com.xlf.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * author: xiaoliufu
 * date:   2017/6/5.
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@Slf4j
public class UserInfoMapperTest {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    public void selectUserInfoById() throws Exception {
        UserInfo userInfo = userInfoMapper.selectUserInfoById(1);
        UserInfo userInfo2 = userInfoMapper.selectUserInfoById(2);
        log.info("userInfo={} userInfo2={}", userInfo,userInfo2);
    }

}