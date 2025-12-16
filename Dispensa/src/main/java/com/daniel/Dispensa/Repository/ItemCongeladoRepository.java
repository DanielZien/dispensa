package com.daniel.Dispensa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.Dispensa.Model.ComidaCongelada;

public interface ItemCongeladoRepository extends JpaRepository<ComidaCongelada, Long>{
    
}
