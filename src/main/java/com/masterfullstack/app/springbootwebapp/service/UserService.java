package com.masterfullstack.app.springbootwebapp.service;

import com.masterfullstack.app.springbootwebapp.models.entity.User;
import com.masterfullstack.app.springbootwebapp.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    PasswordEncoder passwordEncoder;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();

    }
    public String findUserByCredenciales(String email, String password) {

        String emailUser = this.userRepository.findUserEmailByEmail(email );
        if(emailUser==null){
            return "error";
        }else{
            String passwordHash =this.userRepository.findUserPasswordByEmail(email);

            if (passwordEncoder.matches(password,passwordHash)){
                return "ok";
            }else{
                return "error";
            }
        }

    }

    public Boolean crearUsuario(User user) {
    String encodedPassword = this.passwordEncoder.encode(user.getPassword());

    if( this.userRepository.findUserEmailByEmail(user.getEmail())==null){
        return false;
    }else{
        user.setPassword(encodedPassword);
        this.userRepository.save(user);
        return true ;
    }

    }


}
