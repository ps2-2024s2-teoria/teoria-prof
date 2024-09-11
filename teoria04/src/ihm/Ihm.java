package ihm;
import api.GerenciadorNomes;
import java.util.Scanner;
import static java.lang.System.out;
public class Ihm {
    private GerenciadorNomes g;
    private Scanner sc = new Scanner(System.in);
    public Ihm(GerenciadorNomes g) {
        this.g = g;
    }
    public void dialogar() {
        boolean sair = false;
        while(!sair) {
            out.println("\n(1) Consultar nomes");
            out.println("(2) Adicionar nome");
            out.println("(0) Sair");
            out.print("Escolha uma opção: ");
            int op = Integer.parseInt(sc.nextLine());
            switch(op) {
                case 1: consultar(); break;
                case 2: adicionar(); break;
                case 0: sair = true; break;
                default: out.println("Opção inválida!");
            }
        }
        out.println("FIM!");
    }
    public void consultar() {
        out.println("\nLISTA DE NOMES:");
        for (String nome: g.obterNomes()) {
            out.println("* " + nome);
        }
    }
    public void adicionar() {
        out.print("\nNome a ser adicionado: ");
        String nome = sc.nextLine();
        g.adicionar(nome);
    }
}
