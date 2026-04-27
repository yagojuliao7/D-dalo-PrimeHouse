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
@Table(name = "imoveis")
public class imoveis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "valor-imovel")
    private Double valorImovel;

    @Column(name = "bairro_imovel")
    private String bairroImovel;

    @Column(name = "proprietario")
        private Double proprietario;
    

    @OneToMany
    @JoinColumn(name = "id_imovel")
    private List<clientes> clientes;

    public imoveis(){

    }
    public imoveis(Integer id, Double valorImovel, String bairroImovel,Double proprietario, List<clientes> clientes){
        this.id = id;
        this.valorImovel= valorImovel;
        this.bairroImovel = bairroImovel;
        this.proprietario = proprietario;
        this.clientes = clientes;

    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getValorImovel() {
        return valorImovel;
    }
    public void setValorImovel(Double valorImovel) {
        this.valorImovel = valorImovel;
    }
    public String getBairroImovel() {
        return bairroImovel;
    }
    public void setBairroImovel(String bairroImovel) {
        this.bairroImovel = bairroImovel;
    }
    public Double getProprietario() {
        return proprietario;
    }
    public void setProprietario(Double proprietario) {
        this.proprietario = proprietario;
    }
    public List<clientes> getClientes() {
        return clientes;
    }
    public void setClientes(List<clientes> clientes) {
        this.clientes = clientes;
    }
    
}
