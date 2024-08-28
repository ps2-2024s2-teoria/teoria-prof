public abstract class ObraCultural {
    private String titulo;
    private int ano;
    public ObraCultural(String t, int a) {
        titulo = t;
        ano = a;
    }
    void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
    }
    abstract int tempoTotal();
}