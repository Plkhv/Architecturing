package com.misis.archapp.user.configuration;

import com.misis.archapp.user.dto.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {
    @Bean
    public UserMapper userMapper() {
        return UserMapper.INSTANCE;
    }
}
