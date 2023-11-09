package com.example.cuadernojava.entities;

import jakarta.persistence.*;
import java.io.Serializable;


import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "person")
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "dni")
    private String dni;


}
