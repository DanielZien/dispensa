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
    public ItemDespensa salve(ItemDespensa item){
        return itemRepository.save(item);
    }
    //ATUALIZAR
    public ItemDespensa atualizarItem(Long id, ItemDespensa itemAtualizado) {
        ItemDespensa existente = itemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        existente.setNome(itemAtualizado.getNome());
        existente.setDataValidade(itemAtualizado.getDataValidade());
        existente.setQuantidade(itemAtualizado.getQuantidade());
        existente.setLocalizacao(itemAtualizado.getLocalizacao());

        return itemRepository.save(existente);
    }

    //DELETAR
    public void delete(Long Id){
        itemRepository.deleteById(Id);
    }
}
