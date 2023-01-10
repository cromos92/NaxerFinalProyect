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
    public Boolean findUserByCredenciales(String email, String password) {

        String emailUser = this.userRepository.findUserEmailByEmail(email );
        System.out.println("emailuser "+emailUser);
        if(emailUser==null){
            System.out.println(  "email no existe");
            return false;
        }else{
            String passwordHash =this.userRepository.findUserPasswordByEmail(email);
            System.out.println(  "passwordhashed "+passwordHash);
            if (passwordEncoder.matches(password,passwordHash)){

                System.out.println(  "clave Coincide "+passwordHash);
                return true;
            }else{
                System.out.println(  "clave NO Coincide ");
                return false;
            }
        }

    }

    public Boolean crearUsuario(User user) {
    String encodedPassword = this.passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        System.out.println(this.userRepository.findUserEmailByEmail(user.getEmail()));
    if( this.userRepository.findUserEmailByEmail(user.getEmail())==null){
        user.setPassword(encodedPassword);
        this.userRepository.save(user);
        return true;
    }else{
        return false ;
    }

    }


}
