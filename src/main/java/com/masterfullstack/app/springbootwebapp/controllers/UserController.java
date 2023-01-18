package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.User;
import com.masterfullstack.app.springbootwebapp.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)

@RequestMapping("/login")
public class UserController {
    private  final UserService userService;

    public UserController(UserService userService  ) {
        this.userService = userService;

    }
    @PostMapping()
    public Boolean CrearUsuario(@RequestBody User user){


       return     this.userService.crearUsuario(user);
    }
    @PostMapping("/searchUser")
    public Boolean BuscarCredencialesUsuario(@RequestBody User user){
        System.out.println(user);
        return this.userService.findUserByCredenciales(  user.getEmail(), user.getPassword());
    }
}
