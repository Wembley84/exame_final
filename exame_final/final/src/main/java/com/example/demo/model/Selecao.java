package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Selecao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer numero_copas;
    private String cor_camisa_principal;
    private String cor_camisa_secundaria;
    private boolean favorita;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumero_copas() {
        return numero_copas;
    }
    public void setNumero_copas(Integer numero_copas) {
        this.numero_copas = numero_copas;
    }
    public String getCor_camisa_principal() {
        return cor_camisa_principal;
    }
    public void setCor_camisa_principal(String cor_camisa_principal) {
        this.cor_camisa_principal = cor_camisa_principal;
    }
    public String getCor_camisa_secundaria() {
        return cor_camisa_secundaria;
    }
    public void setCor_camisa_secundaria(String cor_camisa_secundaria) {
        this.cor_camisa_secundaria = cor_camisa_secundaria;
    }
    public boolean isFavorita() {
        return favorita;
    }
    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }   

    


    
}
