package com.xlf.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * author: xiaoliufu
 * date:   2017/6/5.
 * description: mybatis+数据库配置
 */
@MapperScan(basePackages = "com.xlf.mapper")
@EnableTransactionManagement
@Configuration
public class DBConfig {
}
