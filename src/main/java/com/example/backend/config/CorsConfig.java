package com.example.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        // 設置允許所有來源
        config.addAllowedOriginPattern("*");  // 使用 pattern 而不是具體的 origin

        // 允許所有方法
        config.addAllowedMethod("*");

        // 允許所有 headers
        config.addAllowedHeader("*");

        // 允許暴露所有 headers
        config.addExposedHeader("*");

        // 允許憑證
        config.setAllowCredentials(true);

        config.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}