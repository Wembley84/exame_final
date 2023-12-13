package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Selecao;

@Repository
public interface SelecaoRepository  extends JpaRepository<Selecao, Long>{
    
}
