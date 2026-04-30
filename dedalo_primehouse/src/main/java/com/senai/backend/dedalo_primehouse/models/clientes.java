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
@Table(name = "Clientes")
public class clientes {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "cpf_cliente")
    private Double cpfCliente;

    @Column(name = "telefone_cliente")
    private Double telefoneCliente;

    @Column(name = "email_cliente")
    private Double emailCliente;

    @OneToMany
    @JoinColumn(name = "proprietario")
    private List<imoveis>imoveis;

    @OneToMany
    @JoinColumn(name = "comprador")
    private List<vendas> vendas;

    public clientes(){

    }

    public clientes(Integer id, String nome_cliente, Double cpfCliente, Double telefoneCliente, Double emailCliente){
        this.id = id;
        this.nome = nome_cliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(Double cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(Double telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public Double getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(Double emailCliente) {
        this.emailCliente = emailCliente;
    }

    

}
