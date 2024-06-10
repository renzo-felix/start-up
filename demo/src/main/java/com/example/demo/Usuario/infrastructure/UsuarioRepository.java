package com.example.demo.Usuario.infrastructure;


import com.example.demo.Usuario.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}