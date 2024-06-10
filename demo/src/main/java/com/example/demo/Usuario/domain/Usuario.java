package com.example.demo.Usuario.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter

@Table(name = "usuario")
public class Usuario {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @Column
    private String pais;

    @Column
    private String telefono;

    @Column
    private String email;

    @Column
    private String role;
    
    @Column
    private boolean status;
    //@OneToMany(mappedBy = "usuario")
    //private List<Usuario_Grupo> grupos;

    // Getters and setters
}
