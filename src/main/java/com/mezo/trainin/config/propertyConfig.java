package com.mezo.trainin.config;

import com.mezo.trainin.dataSource.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class propertyConfig {

    @Autowired
    Environment env;

    @Value("${mezo.url}")
    private String url;

    @Bean
    FakeDataSource getDatasource(){
        return new FakeDataSource(env.getProperty("MEZO_DATASOURCE_USERNAME"),env.getProperty("MEZO_DATASOURCE_PASS"),url);
    }


}
