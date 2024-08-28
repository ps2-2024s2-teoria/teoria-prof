public class Serie extends ObraCultural {
    private int qtdeEpisodios;
    private int duracaoEpisodio;
    public Serie(String t, int a, int q, int d) {
        super(t, a);
        qtdeEpisodios = q;
        duracaoEpisodio = d;
    }
    void mostrar() {
        super.mostrar();
        System.out.println("Qtde. Episódios: " + qtdeEpisodios);
        System.out.println("Duração de cada episódio: " + duracaoEpisodio);
    }
    int tempoTotal() {
        return qtdeEpisodios * duracaoEpisodio;
    }
    public int getQtdeEpisodios() {
        return qtdeEpisodios;
    }
}
