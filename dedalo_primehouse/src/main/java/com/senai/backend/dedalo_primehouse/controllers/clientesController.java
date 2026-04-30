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

import com.senai.backend.dedalo_primehouse.models.clientes;
import com.senai.backend.dedalo_primehouse.services.clientesService;

@RestController
@RequestMapping("/cliente")
public class clientesController {

    @Autowired
    private clientesService clienteService;

    @GetMapping("/contar-clientes")
    public Long contarclientes(){
        return clienteService.contarClientes();
    }
    
    @GetMapping("/buscar-clientes/{id}")
    public clientes contarClientes(@PathVariable Integer id){
        return clienteService.buscarClientes(id);
    }

    @GetMapping("/listar-clientes")
    public List<clientes> listarClientes(){
        return clienteService.listarClientes();
    }

    @DeleteMapping("/deletar-cliente/")
    public String deleteCliente(@PathVariable Integer id){
        if (clienteService.deletarClientes(id)) {
            return "Cliente deletado com sucesso";
        }
        return "Falha ao deletar o cliente";
    }

    @PostMapping("/salvar-cliente")
    public clientes cadastrarClientes(@RequestBody clientes cliente){
        return clienteService.cadastrarClientes(cliente);
    }

    @PutMapping("/atualizar-cliente/{id}")
    public String atualizarClientes(@PathVariable Integer id, @RequestBody clientes cliente){
        if (clienteService.atualizarClientes(id, cliente) != null) {
            return "Cliente atualizado com sucesso";
        }
        return "Falha ao atualizar o cliente";
    }
}
