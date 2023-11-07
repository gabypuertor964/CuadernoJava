/*
* Representación de la tabla User
* */

package com.example.springboot.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Declaración de Entidad/Tabla en BD
@Entity
public class User {
    //Declaración de uso de llave primaria (nombre por defecto "id")
    @Id
    //Generación de valor para la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Declaración de atributos
    private Long id;
    private String name;
    private String email;
    private String password;

    //Metodos Get (Consulta)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    //Métodos Set (Modificación)
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}