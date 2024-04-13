package com.trngtien.saarm_be.services;

import com.trngtien.saarm_be.common.PaginationDefault;
import com.trngtien.saarm_be.models.User;
import com.trngtien.saarm_be.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Page<User> getUsers() {
        int page = 2;
        Pageable pageable = PageRequest.of(page, page * PaginationDefault.DEFAULT_LIMIT, Sort.by(Sort.Direction.DESC, "id"));

        return userRepository.findAll(pageable);
    }
}
