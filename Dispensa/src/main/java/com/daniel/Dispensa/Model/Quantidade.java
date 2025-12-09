package com.daniel.Dispensa.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Quantidade {
    private Double valor;
    private Unidade unidade;

    public Quantidade(Unidade unidade, Double valor) {
        this.unidade = unidade;
        this.valor = valor;
    }

    public Quantidade(){
        
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Unidade getUnidade() {
        return unidade;
    }
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
}
