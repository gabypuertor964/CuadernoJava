package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Declaración controlador
@Controller
public class AuthController {

    //Redirección por defecto al login
    @GetMapping(path = {"/"})
    public String RedirectToLogin(){
        return "redirect:/login";
    }

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
}