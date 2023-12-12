package com.mezo.trainin.config;

import com.mezo.trainin.dataSource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class propertyConfig {

    @Value("${mezo.username}")
    private String username;

    @Value("${mezo.password}")
    private String password;

    @Value("${mezo.url}")
    private String url;

    @Bean
    FakeDataSource getDatasource(){
        System.out.println(username+" "+password+" "+url);
        return new FakeDataSource(username,password,url);
    }


}
