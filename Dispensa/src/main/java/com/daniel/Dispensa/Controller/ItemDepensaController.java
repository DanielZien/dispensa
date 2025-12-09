package com.daniel.Dispensa.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
