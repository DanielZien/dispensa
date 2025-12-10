package com.daniel.Dispensa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.Dispensa.Model.LocalArmazen;

public interface LocalArmazenadoRepository extends JpaRepository<LocalArmazen,Long>{
    
}
