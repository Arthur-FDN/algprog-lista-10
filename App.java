public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Daniel", 18, "123456789", "profdanhpaiva@gmail.com");
        System.out.print(pessoa.getNome() + " está ");
        pessoa.comer("churrasco");

        pessoa.falar();
        pessoa.andar();
        pessoa.dormir();

        Estudante estudante = new Estudante("Maria", 19, "111.111.111-11", "maria@email.com", "Ciência da Computação", 1);
        System.out.println(estudante.getNome() + " estuda " + estudante.getCurso() + " (" + estudante.getPeriodo() + "º período)");
        estudante.comer();

        Animal animal = new Animal("Bicho", "Desconhecida");
        System.out.println(animal.getNome() + " faz: " + animal.emitirSom());
        Cachorro cachorro = new Cachorro("Rex", "Labrador");
        System.out.println(cachorro.getNome() + " (" + cachorro.getRaca() + ") faz: " + cachorro.emitirSom());

        Carro carro = new Carro("Fiat", "Uno", 2010);
        carro.acelerar(60);
        carro.mostrarStatus();

        new Livro("Dom Casmurro", "Machado de Assis", 256).mostrarInfo();
        new Filme("O Senhor dos Anéis", "Peter Jackson", 178).mostrarInfo();
        new Comida("Pão de queijo", 120).mostrarInfo();
        new Cidade("Belo Horizonte", "MG", 2500000).mostrarInfo();
        new Computador("Dell", 16, 512).mostrarInfo();
    }
}
