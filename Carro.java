public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int km) {
        velocidade += km;
    }

    public void mostrarStatus() {
        System.out.println(marca + " " + modelo + " (" + ano + ") - velocidade: " + velocidade + " km/h");
    }
}
