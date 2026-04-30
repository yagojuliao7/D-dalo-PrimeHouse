package com.senai.backend.dedalo_primehouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendas")
public class vendas {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Integer id;

    @Column(name= "imovel")
    private String Imoveis;

    @Column(name= "comprador")
    private String Comprador;

    @Column(name= "corretor")
    private String Corretor;

    @Column(name= "Data venda")
    private String Data_venda;

    public vendas(String Comprador, String Corretor, String Data_venda, String Imoveis, Integer id) {
        this.Comprador = Comprador;
        this.Corretor = Corretor;
        this.Data_venda = Data_venda;
        this.Imoveis = Imoveis;
        this.id = id;
    }

    public vendas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImoveis() {
        return Imoveis;
    }

    public void setImoveis(String Imoveis) {
        this.Imoveis = Imoveis;
    }

    public String getComprador() {
        return Comprador;
    }

    public void setComprador(String Comprador) {
        this.Comprador = Comprador;
    }

    public String getCorretor() {
        return Corretor;
    }

    public void setCorretor(String Corretor) {
        this.Corretor = Corretor;
    }

    public String getData_venda() {
        return Data_venda;
    }

    public void setData_venda(String Data_venda) {
        this.Data_venda = Data_venda;
    }
    
    
}
