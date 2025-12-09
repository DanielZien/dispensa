package com.daniel.Dispensa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.Dispensa.Model.ItemDespensa;

public interface  ItemRepository extends JpaRepository<ItemDespensa, Long>{
    
}
