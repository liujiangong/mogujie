package com.liu.mall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AjaxConfig {
    /**
     * 允许 其他应用 通过ajax 实现跨域 请求获取数据, 并 支持 会话 唯一性（session 稳定）
     * @return
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("POST", "GET", "PUT", "DELETE")
                        .allowCredentials(true)
                        .allowedHeaders("*")
                        .maxAge(3600)
                        .allowedHeaders(
                                "Access-Control-Allow-Headers",
                                "access-control-allow-origin, authority, content-type, version-info, X-Requested-With");

            }
        };
    }
}





