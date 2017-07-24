package com.epam.ration.service.impl;

import com.epam.ration.dao.UserRepository;
import com.epam.ration.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(
                    "No user found with username: "+ email);
        }
        Set<GrantedAuthority> roles = new HashSet<>();
//        roles.add(new SimpleGrantedAuthority(Role.USER.name()));
        return  new org.springframework.security.core.userdetails.User
                (
                        user.getEmail(),
                        user.getPassword().toLowerCase(),
                        roles
                );


    }

}
