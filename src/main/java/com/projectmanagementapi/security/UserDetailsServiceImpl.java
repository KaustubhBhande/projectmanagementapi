package com.projectmanagementapi.security;

import org.springframework.security.core.userdetails.User; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.projectmanagementapi.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        // Use the static builder from Spring Security's User class
        return User.withUsername(user.getUsername())
                   .password(user.getPassword())
                   .roles(user.getRoles().stream().map(role -> role.getName().name()).toArray(String[]::new))
                   .build();
    }
}