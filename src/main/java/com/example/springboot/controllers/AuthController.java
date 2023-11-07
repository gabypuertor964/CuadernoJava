package com.example.springboot.controllers;

import com.example.springboot.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.springboot.services.UserServices;

//Declaración controlador
@Controller
public class AuthController {

    //Redirección por defecto al login
    @GetMapping(path = {"/"})
    public String RedirectToLogin(){return "redirect:/login";}

    //Retorno vista de inicio de Sesión
    @GetMapping(path = {"/login"})
    public String GetViewLogin(){
        return "auth/login";
    }

    //Retorno vista de Registro
    @GetMapping(path = {"/register"})
    public String GetViewRegister(){
        return "auth/register";
    }

    //Procesamiento Registro de usuario
    @PostMapping(path = {"/register"})
    public String PostRegister(@RequestBody String name, @RequestBody String email, @RequestBody String password){
        User user = UserServices.registerUser(name, email, password);
        return "redirect:/login";
    }

}