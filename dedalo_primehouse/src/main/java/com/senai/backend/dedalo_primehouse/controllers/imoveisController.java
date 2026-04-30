package com.senai.backend.dedalo_primehouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.dedalo_primehouse.models.imoveis;
import com.senai.backend.dedalo_primehouse.services.imoveisService;

@RestController
@RequestMapping("/imoveis")
public class imoveisController {

    @Autowired
    private imoveisService imoveisService;

    @GetMapping("/contar-imoveis")
    public Long contarImoveis(){
        return imoveisService.contarImoveis();
    }

    @GetMapping("/buscar-imovel/{id}")
    public imoveis buscarImoveis(@PathVariable Integer id){
        return imoveisService.buscarImoveis(id);
    }

    @GetMapping("/listar-imoveis")
    public List<imoveis> listarImoveis(){
        return imoveisService.listarImoveis();
    }

    @DeleteMapping("/deletar-imoveis/{id}")
    public String deletarImoveis(@PathVariable Integer id){
        if (imoveisService.deletarImoveis(id)) {
            return "Imovel excluído com sucesso";
        }
        return "Falha na exclusão do imóvel";
    }

    @PostMapping("/salvar-imovel")
    public imoveis cadastarImoveis(@RequestBody imoveis imoveis){
        return imoveisService.cadastrarImoveis(imoveis);
    }

    @PutMapping("atualizar-imovel/{id}")
    public String atualizarImoveis(@PathVariable Integer id, @RequestBody imoveis imoveis){
        if (imoveisService.atualizarImoveis(id, imoveis) != null) {
            return "Imovel atualizado com sucesso";
        }
        return "Falha ao atualizar o imovel";
    }

    
}
