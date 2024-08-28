public class Serie {
    private String titulo;
    private int ano;
    private int qtdeEpisodios;
    public Serie(String t, int a, int q) {
        titulo = t;
        ano = a;
        qtdeEpisodios = q;
    }
    void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Qtde. Episódios: " + qtdeEpisodios);
    }
}
