import api.GerenciadorNomes;
import impl.GerenciadorNomesMem;
import ihm.Ihm;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("PS2 Teoria 04!");
        GerenciadorNomes g = new GerenciadorNomesMem();
        Ihm ihm = new Ihm(g);
        ihm.dialogar();
    }
}
