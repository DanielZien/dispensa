package com.daniel.Dispensa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.Dispensa.Model.ComidaCongelada;
import com.daniel.Dispensa.Repository.ItemCongeladoRepository;

@Service
public class ItemCongeladoService {
    private final ItemCongeladoRepository repo;

    public ItemCongeladoService(ItemCongeladoRepository repo){
        this.repo = repo;
    }

    //LISTAR
    public List<ComidaCongelada> getAll(){
        return repo.findAll();
    }
    //CRIAR
    public ComidaCongelada salve(ComidaCongelada item){
        return repo.save(item);
    }
    //ATUALIZAR
    public ComidaCongelada atualizarItem(Long id, ComidaCongelada itemAtualizado){
        ComidaCongelada existente = repo.findById(id)
        .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        existente.setNome(itemAtualizado.getNome());
        existente.setDataValidade(itemAtualizado.getDataValidade());
        existente.setQuantidade(itemAtualizado.getQuantidade());
        existente.setLocalizacao(itemAtualizado.getLocalizacao());

        return repo.save(existente);
    }
    //DELETAR
    public void delete(Long Id){
        repo.deleteById(Id);
    }

}
