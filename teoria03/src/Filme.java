public class Filme extends ObraCultural {
    private int duracao;
    public Filme(String t, int a, int d) {
        super(t, a);
        duracao = d;
    }
    void mostrar() {
        super.mostrar();
        System.out.println("Duração: " + duracao);
    }
    int tempoTotal() {
        return duracao;
    }
    public int getDuracao() {
        return duracao;
    }

}
