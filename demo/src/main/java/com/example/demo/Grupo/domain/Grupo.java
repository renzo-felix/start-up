package com.example.demo.Grupo.domain;


import com.example.demo.Usuario.domain.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int maxUsuarios;
    private String direccion;
    private String platoComida;

    @OneToMany(mappedBy = "grupo")
    private List<Usuario> usuarios;
    /* @OneToMany(mappedBy = "grupo")
    private List<Oferta> ofertas;

    @OneToMany(mappedBy = "grupo")
    private List<Pedido> pedidos;*/

    

    // Getters y setters son generados por Lombok, pero los añado manualmente aquí
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxUsuarios() {
        return maxUsuarios;
    }

    public void setMaxUsuarios(int maxUsuarios) {
        this.maxUsuarios = maxUsuarios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPlatoComida() {
        return platoComida;
    }

    public void setPlatoComida(String platoComida) {
        this.platoComida = platoComida;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    /*

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }*/
}
