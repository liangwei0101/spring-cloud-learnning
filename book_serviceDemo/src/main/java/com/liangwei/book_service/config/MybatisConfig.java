package com.liangwei.book_service.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {

            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                // 设置驼峰命名规则
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}