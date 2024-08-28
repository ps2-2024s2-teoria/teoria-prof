public class AppObra {
    public static void main(String[] args) throws Exception {
        ObraCultural f = new Filme("Os Vingadores", 2012, 220);
        f.mostrar();
        System.out.println("Tempo total: " + f.tempoTotal());

        ObraCultural y = new Serie("Breaking Bad", 2013, 15, 45);
        y.mostrar();
        System.out.println("Tempo total: " + y.tempoTotal());        

        Filme x = (Filme)f;
        System.out.println("Duração do filme: " + x.getDuracao());
    }    
}
