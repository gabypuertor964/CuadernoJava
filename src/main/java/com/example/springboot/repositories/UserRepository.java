/*
* Clase encargada de realizar las operaciones en BD
* */
package com.example.springboot.repositories;

//Importación interfaz JPA
import org.springframework.data.jpa.repository.JpaRepository;

//Importación entidad/Tabla User
import com.example.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
