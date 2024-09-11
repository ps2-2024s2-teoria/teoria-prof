package api;
import java.util.List;
public interface GerenciadorNomes {
    int MAX_CARACTERES_NOME = 30;
    List<String> obterNomes();
    void adicionar(String nome);
}
