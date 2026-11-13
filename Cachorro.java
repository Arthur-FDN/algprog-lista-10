public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome, "Cachorro");
        this.raca = raca;
    }

    public String getRaca() { return raca; }

    @Override
    public String emitirSom() {
        return "Au au!";
    }
}
