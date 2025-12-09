package com.daniel.Dispensa.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="comida_congelada")
public class ComidaCongelada extends ItemDespensa {

    private int temperaturaCongelamento;

    public ComidaCongelada(Long Id, LocalDate dataValidade, LocalArmazen localizacao, String nome,
            Quantidade quantidade, int temperaturaCongelamento) {
        super(Id, dataValidade, localizacao, nome, quantidade);
        this.temperaturaCongelamento = temperaturaCongelamento;
    }

    public ComidaCongelada(){
        
    }

    public int getTemperaturaCongelamento() {
        return temperaturaCongelamento;
    }

    public void setTemperaturaCongelamento(int temperaturaCongelamento) {
        this.temperaturaCongelamento = temperaturaCongelamento;
    }

}
