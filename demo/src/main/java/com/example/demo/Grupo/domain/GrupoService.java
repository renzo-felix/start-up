package com.example.demo.Grupo.domain;


import com.example.demo.Grupo.domain.*;
import com.example.demo.Grupo.infraestructure.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    public Grupo findById(int id) {
        return grupoRepository.findById(id).orElse(null);
    }

    public Grupo save(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public void deleteById(int id) {
        grupoRepository.deleteById(id);
    }
}
