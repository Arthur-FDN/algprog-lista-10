public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String email;

    public Pessoa(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void falar() {
        System.out.println("Olá!");
    }

    public void comer() {
        System.out.println("Comendo algo...!");
    }

    public void comer(String lanche) {
        System.out.println("Comendo " + lanche);
    }

    public void dormir() {
        System.out.println("Dormindo!");
    }

    public void andar() {
        System.out.println("Andando tantos metros!");
    }
}
