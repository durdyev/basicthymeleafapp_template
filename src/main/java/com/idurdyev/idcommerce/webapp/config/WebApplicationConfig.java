package com.idurdyev.idcommerce.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Web application configuration
 * @author Ilya Durdyev, ilya.durdyev@gmail.com, icq 159152
 */
@Configuration
public class WebApplicationConfig extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ThymeLeafLayoutInterceptor());
    }
}
