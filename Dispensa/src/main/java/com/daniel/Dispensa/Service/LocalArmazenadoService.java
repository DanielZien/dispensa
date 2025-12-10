package com.daniel.Dispensa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.Dispensa.Model.LocalArmazen;
import com.daniel.Dispensa.Repository.LocalArmazenadoRepository;

@Service
public class LocalArmazenadoService {
    private final LocalArmazenadoRepository localRepo;

    public LocalArmazenadoService(LocalArmazenadoRepository localRepo){
        this.localRepo = localRepo;
    }

    //LISTAR 
    public List<LocalArmazen> getAll(){
        return localRepo.findAll();
    }
    //CRIAR 
    public LocalArmazen salve(LocalArmazen local){
        return localRepo.save(local);
    }
    //ATUALIZAR
    public LocalArmazen atualizarLocal(Long id, LocalArmazen localAtualizado){
        LocalArmazen existente = localRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Local não encontrado"));
        
        existente.setNome(localAtualizado.getNome());
        existente.setLocalizacao(localAtualizado.getLocalizacao());
        
        return localRepo.save(existente);
    } 
    //DELETAR
    public void delete(Long id){
        localRepo.deleteById(id);
    }
}
