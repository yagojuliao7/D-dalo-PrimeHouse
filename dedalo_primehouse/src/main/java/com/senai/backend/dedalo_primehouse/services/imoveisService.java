package com.senai.backend.dedalo_primehouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo_primehouse.models.imoveis;
import com.senai.backend.dedalo_primehouse.repositories.imoveisRepository;

@Service
public class imoveisService {
    
    @Autowired
    private imoveisRepository imoveisRepository;

    public Long contarImoveis(){
        return imoveisRepository.count();
    }

    public imoveis buscarImoveis(Integer id){
        return imoveisRepository.findById(id).get();
    }

    public List<imoveis> listarImoveis(){
        return imoveisRepository.findAll();
    }

    public Boolean deletarImoveis(Integer id){
        if (imoveisRepository.existsById(id)) {
            imoveisRepository.deleteById(id);
            return true;
            
        }
        return false;
    }

    public imoveis cadastrarImoveis(imoveis imoveis){
        return imoveisRepository.save(imoveis);
    }

    public imoveis atualizarImoveis(Integer id, imoveis imoveis){
        imoveis imovelRecuperada = buscarImoveis(id);
        if (imovelRecuperada != null) {
            imovelRecuperada.setId(id);
            if (imoveis.getProprietario() !=null) {
                imovelRecuperada.setProprietario(imoveis.getProprietario());
                
            }
            return imoveisRepository.save(imovelRecuperada);
            
        }
        return null;
    }
}
