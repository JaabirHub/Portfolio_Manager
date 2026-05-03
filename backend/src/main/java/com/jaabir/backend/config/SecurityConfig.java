package com.jaabir.backend.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * This allows the following endpoints to be accessed.
 */
@Configuration
public class SecurityConfig {
    
  /**
   * This allows the following endpoints to be accessed.
   *
   * @param http The HttpSecurity to configure.
   * @return The configured Security Filter Chain.
   * @throws Exception if an error occurs while building the filter chain.
   */
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
      .csrf(csrf -> csrf.disable())
      .headers(headers -> headers
      .frameOptions(frame -> frame.sameOrigin())
      )
      .authorizeHttpRequests(auth -> auth
        .requestMatchers(
          "/",
          "/h2-console/**",
          "/swagger-ui/**",
          "/swagger-ui.html",
          "/v3/api-docs/**"
        ).permitAll()
        .anyRequest().authenticated()
      )
        .httpBasic(withDefaults());
    return http.build();
  }
}