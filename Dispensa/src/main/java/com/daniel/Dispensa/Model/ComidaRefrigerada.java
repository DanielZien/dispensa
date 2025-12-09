package com.daniel.Dispensa.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "comida_refrigerada")
public class ComidaRefrigerada extends ItemDespensa {

    private int temperaturaIdeal;

    // Construtor vazio exigido pelo JPA
    public ComidaRefrigerada() {
    }

    // Construtor completo
    public ComidaRefrigerada(Long id, LocalDate dataValidade, LocalArmazen localizacao,
                             String nome, Quantidade quantidade, int temperaturaIdeal) {
        super(id, dataValidade, localizacao, nome, quantidade);
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(int temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }
}