package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.User;
import com.masterfullstack.app.springbootwebapp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/login")
public class UserController {
    private  final UserService userService;

    public UserController(UserService userService  ) {
        this.userService = userService;

    }
    @PostMapping()
    public Boolean createUser(@RequestBody User user){

        this.userService.crearUsuario(user);

       return true;
    }
    @PostMapping("/searchUser")
    public String findUserByCredenciales(@RequestBody User user){
        System.out.println(user);
        return this.userService.findUserByCredenciales(  user.getEmail(), user.getPassword());
    }
}
