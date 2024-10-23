package br.mackenzie.wsrestdb;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {
    @Autowired
    private FilmeRepo filmeRepo;

    public FilmeController() {
    }  
    @GetMapping("/api/filmes")
    public Iterable<Filme> consultarTodosFilmes() {
        return filmeRepo.findAll();
    }
    @GetMapping("/api/filmes/{id}")
    public Optional<Filme> consultarFilme(@PathVariable long id) {
        return filmeRepo.findById(id);
    }
    @PostMapping("/api/filmes")
    public Filme adicionar(@RequestBody Filme novoFilme) {
        return filmeRepo.save(novoFilme);
    }
}
