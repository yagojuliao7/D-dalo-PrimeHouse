package com.senai.backend.dedalo_primehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.dedalo_primehouse.models.vendas;

@Repository
public interface vendasRepository extends JpaRepository<vendas, Integer>{
    
}
