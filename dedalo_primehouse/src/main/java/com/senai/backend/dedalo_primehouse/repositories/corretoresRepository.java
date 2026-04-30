package com.senai.backend.dedalo_primehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.dedalo_primehouse.models.corretores;

@Repository
public interface corretoresRepository extends JpaRepository<corretores, Integer>{
    
}
