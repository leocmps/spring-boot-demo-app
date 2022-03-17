package com.example.demo.Services;

import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepo;

    @Autowired
    public UserService (UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void addUser (Object user) {
        if (isValid(user)) userRepo.addUser(user);
    }

    public boolean isValid (Object user) {
        return true;
    }
}
