package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //Declaración de metodo en el Patron de Diseño Factory
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        //Establecer reglas de seguridad para peticiones HTTP
        http.authorizeHttpRequests((authz) -> authz

                        /*
                         * Acceso a rutas publicas y de autenticación
                         * */
                        .requestMatchers("/**").permitAll()
                        .requestMatchers("/auth/**").permitAll()

                        /*
                         * Restricción de acceso a rutas privadas (Autenticación requerida)
                         * */
                        .anyRequest().authenticated()
                );

        //Retornar reglas de connexion
        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        //Retorno objeto para encriptar contraseñas
        return new BCryptPasswordEncoder();
    }
}
