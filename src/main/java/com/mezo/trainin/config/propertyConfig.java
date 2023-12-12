package com.mezo.trainin.config;

import com.mezo.trainin.dataSource.FakeDataSource;
import com.mezo.trainin.dataSource.FakeJms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
// To import multiple property source
// Option 1:
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
// Option 2:
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})

public class propertyConfig {

    @Autowired
    Environment env;

    @Value("${mezo.datasource.url}")
    private String url;

    @Value("${mezo.jms.username}")
    private String jms_username;

    @Value("${mezo.jms.pass}")
    private String jms_pass;

    @Bean
    FakeDataSource getDatasource() {
        return new FakeDataSource(env.getProperty("MEZO_DATASOURCE_USERNAME"), env.getProperty("MEZO_DATASOURCE_PASS"), url);
    }

    @Bean
    FakeJms getJms() {
        return new FakeJms(jms_username, jms_pass);
    }


}
