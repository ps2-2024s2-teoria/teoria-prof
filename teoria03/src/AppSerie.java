public class AppSerie {
    public static void main(String[] args) throws Exception {
        Serie s = new Serie("Breaking Bad", 2013, 15, 45);
        s.mostrar();
        System.out.println("Tempo total: " + s.tempoTotal());
    } 
}
