package com.daniel.Dispensa.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.Dispensa.Model.ItemDespensa;
import com.daniel.Dispensa.Service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemDepensaController {
    
    
    private final ItemService itemService;

    public ItemDepensaController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<ItemDespensa> getAll() {
        return itemService.getAll();
    }
    @PostMapping
    public ItemDespensa create(@RequestBody ItemDespensa item) {
        return itemService.salve(item);
    }
     @PutMapping("/{id}")
    public ItemDespensa update(@PathVariable Long id, @RequestBody ItemDespensa itemAtualizado) {
        return itemService.atualizarItem(id, itemAtualizado);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemService.delete(id);
    }

}
