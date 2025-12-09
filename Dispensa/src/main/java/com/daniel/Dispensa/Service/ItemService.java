package com.daniel.Dispensa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.Dispensa.Model.ItemDespensa;
import com.daniel.Dispensa.Repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    //LISTAR
    public List<ItemDespensa> getAll() {
        return itemRepository.findAll();
    }

    //CRIAR
    public ItemDespensa save(ItemDespensa item){
        return itemRepository.save(item);
    }
    //DELETAR
    public void delete(Long Id){
        itemRepository.deleteById(Id);
    }
}
