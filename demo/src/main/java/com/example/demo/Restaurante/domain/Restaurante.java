package com.example.demo.Restaurante.domain;

import java.math.BigDecimal;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String direccion;
    private BigDecimal calificacion;
    private String telefono;
    @Column(length = 1024)
    private String descripcion;
    private Time horarioApertura;
    private Time horarioSalida;
    private boolean status;

    //@OneToMany(mappedBy = "restaurante")
    //private List<Oferta> ofertas;

    // Getters y setters
}