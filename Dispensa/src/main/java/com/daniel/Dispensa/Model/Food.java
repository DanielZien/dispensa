package com.daniel.Dispensa.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food_table")
public class Food {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private Integer quantid;
    private LocalDate dataValidade;

    public Food(Long Id,String nome, Integer quantid, LocalDate dataValidade) {
        this.Id = Id;
        this.nome = nome;
        this.quantid = quantid;
        this.dataValidade = dataValidade;
    }

    public Food() {
    //Construtor vazio para estancia do JPA
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQuantid() {
        return quantid;
    }
    public void setQuantid(Integer quantid) {
        this.quantid = quantid;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

}
