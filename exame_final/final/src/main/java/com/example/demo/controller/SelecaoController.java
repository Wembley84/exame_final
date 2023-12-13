package com.example.demo.controller;

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

import com.example.demo.model.Selecao;
import com.example.demo.repository.SelecaoRepository;

@RestController
@RequestMapping("/selecao")
public class SelecaoController {
    
    @Autowired
    private SelecaoRepository repository;

    @GetMapping()
    public List<Selecao> findAll(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    private Selecao findById(@PathVariable(value = "id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PostMapping()
    private Selecao salvar(@RequestBody Selecao selecao){
        return repository.save(selecao);
    }

    @PutMapping("{id}")
    public void atualizar(@RequestBody Selecao selecao,   @PathVariable(value = "id") Long id){
        selecao.setId(id);
        repository.save(selecao);
        
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable(value = "id") Long id){
        repository.deleteById(id);
    }
}
