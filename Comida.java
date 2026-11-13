public class Comida {
    private String nome;
    private int calorias;

    public Comida(String nome, int calorias) {
        this.nome = nome;
        this.calorias = calorias;
    }

    public void mostrarInfo() {
        System.out.println("Comida: " + nome + " - " + calorias + " kcal");
    }
}
