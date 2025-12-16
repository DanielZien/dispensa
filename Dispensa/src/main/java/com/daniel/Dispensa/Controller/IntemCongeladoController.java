package com.daniel.Dispensa.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.Dispensa.Model.ComidaCongelada;
import com.daniel.Dispensa.Service.ItemCongeladoService;

@RestController
@RequestMapping("/comida-congelada")
public class IntemCongeladoController {
    
    private final ItemCongeladoService itemService;

    public IntemCongeladoController(ItemCongeladoService itemService){
        this.itemService = itemService;
    }

    @GetMapping
    public List<ComidaCongelada> getAll(){
        return itemService.getAll();
    }
    @PostMapping
    public ComidaCongelada create(@RequestBody ComidaCongelada item){
        return itemService.salve(item);
    }
    @PutMapping("/{id}")
    public ComidaCongelada update(@PathVariable Long id, @RequestBody ComidaCongelada itemAtualizado){
        return itemService.atualizarItem(id, itemAtualizado);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        itemService.delete(id);
    }
}
