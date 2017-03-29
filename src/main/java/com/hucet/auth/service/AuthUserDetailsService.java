package com.hucet.auth.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public interface AuthUserDetailsService {
    public UserDetails loadUserByUserEmail(String email);

    @Slf4j
    @Service
    public class AuthUserDetailsServiceImpl implements AuthUserDetailsService {
        @Override
        public UserDetails loadUserByUserEmail(String email) {
            return null;
        }
    }
}
