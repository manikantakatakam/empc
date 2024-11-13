package com.employee.empc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disables CSRF
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/**").permitAll() // Allows access to /api/employees without authentication
                .anyRequest().authenticated() // Secures all other endpoints
            )
            .httpBasic(); // Enables basic HTTP authentication

        return http.build();
    }
}
