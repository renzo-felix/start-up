package com.example.demo.Restaurante.infraestructure;

import com.example.demo.Restaurante.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {
}
