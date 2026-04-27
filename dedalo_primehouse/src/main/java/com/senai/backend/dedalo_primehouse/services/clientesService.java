package com.senai.backend.dedalo_primehouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo_primehouse.models.clientes;
import com.senai.backend.dedalo_primehouse.repositories.clientesRepository;

@Service
public class clientesService {
    
    @Autowired
    private clientesRepository clientesRepository;

    public Long contarClientes(){
        return clientesRepository.count();
    }

    public clientes buscarClientes(Integer id){
        return clientesRepository.findById(id).get();
    }

    public List<clientes> listarClientes(){
        return clientesRepository.findAll();
    }

    public Boolean deletarClientes(Integer id){
        if (clientesRepository.existsById(id)) {
            clientesRepository.deleteById(id);
            return true;
            
        }
        return false;
    }

    public clientes cadastrarClientes(clientes cliente){
        return clientesRepository.save(cliente);
    }

    public clientes atualizarClientes(Integer id, clientes cliente){
        clientes clienteRecuperado = buscarClientes(id);
        if (clienteRecuperado != null) {
            clienteRecuperado.setId(id);
            if (cliente.getNome() != null) {
                clienteRecuperado.setNome(cliente.getNome());
                
            }
            if (cliente.getCpfCliente() != null) {
                clienteRecuperado.setCpfCliente(cliente.getCpfCliente());
                
            }
            return clientesRepository.save(clienteRecuperado);
            
        }
        return null;
    }
}
