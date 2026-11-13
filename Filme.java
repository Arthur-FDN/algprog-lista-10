public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoMinutos;

    public Filme(String titulo, String diretor, int duracaoMinutos) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void mostrarInfo() {
        System.out.println("Filme: " + titulo + " - dir. " + diretor + " (" + duracaoMinutos + " min)");
    }
}
