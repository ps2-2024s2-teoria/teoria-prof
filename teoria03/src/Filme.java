public class Filme {
    private String titulo;
    private int ano;
    private int duracao;
    public Filme(String t, int a, int d) {
        titulo = t;
        ano = a;
        duracao = d;
    }
    void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao);
    }
}
