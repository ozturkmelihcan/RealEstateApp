package com.melihcan.realestateapp.service;

import com.melihcan.realestateapp.repository.IUserRepository;
import com.melihcan.realestateapp.repository.entity.User;
import com.melihcan.realestateapp.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceManager<User,Long> {


    private final IUserRepository userRepository;
    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository=userRepository;
    }
}
