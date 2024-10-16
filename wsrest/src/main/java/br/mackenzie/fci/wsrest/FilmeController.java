package br.mackenzie.fci.wsrest;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {
    private List<Filme> filmes;
    public FilmeController() {
        filmes = new ArrayList<>();
        filmes.add(new Filme(1, "Velozes e Furiosos", 2001));
        filmes.add(new Filme(2, "Velozes e Furiosos III", 2006));
        filmes.add(new Filme(3, "Coringa", 2020));
    }  
    @GetMapping("/api/filmes")
    public List<Filme> consultarTodosFilmes() {
        return filmes;
    }
    @GetMapping("/api/filmes/{id}")
    public Filme consultarFilme(@PathVariable long id) {
        for (Filme f: filmes) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }
    @PostMapping("/api/filmes")
    public Filme adicionar(@RequestBody Filme novoFilme) {
        long novoId = filmes.get(filmes.size()-1).getId()+1;
        novoFilme.setId(novoId);
        filmes.add(novoFilme);
        return novoFilme;
    }
}
