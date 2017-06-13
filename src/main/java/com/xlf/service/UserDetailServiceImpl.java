package com.xlf.service;

import com.xlf.entity.UserInfo;
import com.xlf.mapper.UserInfoMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * author: xiaoliufu
 * date:   2017/6/6.
 * description: 用户权限service
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoMapper.selectUserInfoByUserName(userName);
        if (userInfo == null){
            throw new UsernameNotFoundException("用户不存在！");
        }
        return new User(userName, userInfo.getPassword(), true, true, true, true, getAuthorities());
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authList;
        authList = new ArrayList<>();
        SimpleGrantedAuthority sGA = new SimpleGrantedAuthority("ROLE_USER");
        authList.add(sGA);
        return authList;
    }
}

