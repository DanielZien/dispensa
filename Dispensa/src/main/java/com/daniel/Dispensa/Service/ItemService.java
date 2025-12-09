package com.daniel.Dispensa.Service;

import org.springframework.stereotype.Service;

import com.daniel.Dispensa.Repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


}
