public class Cidade {
    private String nome;
    private String estado;
    private int populacao;

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public void mostrarInfo() {
        System.out.println("Cidade: " + nome + "/" + estado + " - população: " + populacao);
    }
}
