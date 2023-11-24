package com.ssafy.tennis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ssafy.tennis.model.dao")
public class DBConfig {

}
