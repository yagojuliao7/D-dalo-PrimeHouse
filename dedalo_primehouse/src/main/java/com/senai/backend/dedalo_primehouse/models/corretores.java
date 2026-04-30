package com.senai.backend.dedalo_primehouse.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "corretores")
public class corretores {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_corretor")
    private Integer id;

    @Column(name = "nome_corretor")
    private String nome_corretor;

    @OneToMany
    @JoinColumn(name = "corretor")
    private List<vendas> vendas;

    public corretores(){
        
    }

    public corretores(Integer id, String nome_corretor,
            List<vendas> vendas) {
        this.id = id;
        this.nome_corretor = nome_corretor;
        this.vendas = vendas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_corretor() {
        return nome_corretor;
    }

    public void setNome_corretor(String nome_corretor) {
        this.nome_corretor = nome_corretor;
    }

    public List<vendas> getVendas() {
        return vendas;
    }

    public void setVendas(List<vendas> vendas) {
        this.vendas = vendas;
    }

}
