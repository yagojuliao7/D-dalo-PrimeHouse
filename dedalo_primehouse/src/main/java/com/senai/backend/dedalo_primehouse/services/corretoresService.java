package com.senai.backend.dedalo_primehouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo_primehouse.models.corretores;
import com.senai.backend.dedalo_primehouse.repositories.corretoresRepository;

@Service
public class corretoresService {
    
    @Autowired
    private corretoresRepository corretoresRepository;

    public Long contarCorretores(){
        return corretoresRepository.count();
    }

    public corretores buscarCorretores(Integer id){
        return corretoresRepository.findById(id).get();
    }

    public List<corretores>listarCorretores(){
        return corretoresRepository.findAll();
    }

    public Boolean deletarCorretores(Integer id){
        if (corretoresRepository.existsById(id)) {
            corretoresRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public corretores cadasCorretores(corretores corretores){
        return corretoresRepository.save(corretores);
    }

    public corretores atualizarCorretor(Integer id, corretores corretores){
        corretores corretorRecuperado = buscarCorretores(id);
        if (corretorRecuperado != null) {
            corretorRecuperado.setId(id);
            if (corretores.getNome_corretor() != null) {
                corretorRecuperado.setNome_corretor(corretores.getNome_corretor());
            }
            if(corretores.getId()!= null){
                corretorRecuperado.setId(corretores.getId());
            }
            return corretoresRepository.save(corretorRecuperado);
        }
        return null;
    }

}