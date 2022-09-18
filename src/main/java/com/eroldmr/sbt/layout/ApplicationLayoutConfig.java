package com.eroldmr.sbt.layout;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationLayoutConfig {

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }


}
