public class Computador {
    private String marca;
    private int ramGb;
    private int armazenamentoGb;

    public Computador(String marca, int ramGb, int armazenamentoGb) {
        this.marca = marca;
        this.ramGb = ramGb;
        this.armazenamentoGb = armazenamentoGb;
    }

    public void mostrarInfo() {
        System.out.println("Computador: " + marca + " - " + ramGb + " GB RAM, " + armazenamentoGb + " GB armazenamento");
    }
}
