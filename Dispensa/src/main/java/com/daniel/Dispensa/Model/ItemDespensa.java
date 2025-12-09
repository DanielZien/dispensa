package com.daniel.Dispensa.Model;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="item_despensa")
@Inheritance(strategy=InheritanceType.JOINED)
public class ItemDespensa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private LocalDate dataValidade;
    @Embedded
    private Quantidade quantidade;
    @ManyToOne
    private LocalArmazen localizacao;

    public ItemDespensa(Long Id, LocalDate dataValidade, LocalArmazen localizacao, String nome, Quantidade quantidade) {
        this.Id = Id;
        this.dataValidade = dataValidade;
        this.localizacao = localizacao;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public ItemDespensa(){
        
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
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Quantidade getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Quantidade quantidade) {
        this.quantidade = quantidade;
    }
    public LocalArmazen getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(LocalArmazen localizacao) {
        this.localizacao = localizacao;
    }
}
