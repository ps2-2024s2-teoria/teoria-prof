public class AppFilme {
    public static void main(String[] args) throws Exception {
        Filme f = new Filme("Os Vingadores", 2012, 220);
        f.mostrar();
        System.out.println("Tempo total: " + f.tempoTotal());
    }
}
