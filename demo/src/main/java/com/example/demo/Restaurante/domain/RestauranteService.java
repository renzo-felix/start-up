package com.example.demo.Restaurante.domain;


import com.example.demo.Restaurante.domain.*;
import com.example.demo.Restaurante.infraestructure.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> findAll() {
        return restauranteRepository.findAll();
    }

    public Restaurante findById(int id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    public Restaurante save(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public void deleteById(int id) {
        restauranteRepository.deleteById(id);
    }
}
