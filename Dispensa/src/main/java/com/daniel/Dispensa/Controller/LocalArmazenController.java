package com.daniel.Dispensa.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.daniel.Dispensa.Model.LocalArmazen;

import com.daniel.Dispensa.Service.LocalArmazenadoService;

@RestController
@RequestMapping("/local")
public class LocalArmazenController {
    
    private final LocalArmazenadoService localService;

    LocalArmazenController(LocalArmazenadoService localService){
        this.localService = localService;
    }

    @GetMapping 
    public List<LocalArmazen> getAll(){
        return localService.getAll();
    }
    @PostMapping
    public LocalArmazen create(@RequestBody LocalArmazen local) {
        return localService.salve(local);
    }
    @PutMapping("/{id}")
    public LocalArmazen update(@PathVariable Long id, @RequestBody LocalArmazen localArmazenAtualizado) {
        return localService.atualizarLocal(id, localArmazenAtualizado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        localService.delete(id);
    }

}
