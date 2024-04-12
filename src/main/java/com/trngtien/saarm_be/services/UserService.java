package com.trngtien.saarm_be.services;

import com.trngtien.saarm_be.models.User;
import com.trngtien.saarm_be.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        List<User> data = userRepository.findAll();
        System.out.println("data size: " + data.size());

        return data;
    }
}
