package com.example.MongodbCrud.resource;


import com.example.MongodbCrud.model.User;
import com.example.MongodbCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveAlbum(@RequestBody User user){
        return userService.saveUser(user);
    }
}
