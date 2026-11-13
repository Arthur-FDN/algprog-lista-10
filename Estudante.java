public class Estudante extends Pessoa {
    private String curso;
    private int periodo;

    public Estudante(String nome, int idade, String cpf, String email, String curso, int periodo) {
        super(nome, idade, cpf, email);
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }
}
