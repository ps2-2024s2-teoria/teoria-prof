package impl;
import java.util.*;

import api.GerenciadorNomes;
public class GerenciadorNomesMem implements GerenciadorNomes {
    private ArrayList<String> nomes = new ArrayList<>();
    public List<String> obterNomes() {
        return nomes;
    }
    public void adicionar(String nome) {
        if (nome.length() > MAX_CARACTERES_NOME) {
            throw new RuntimeException();
        }
        nomes.add(nome);
    }
}
