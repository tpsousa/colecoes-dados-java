import java.util.ArrayList;

class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método toString para representar a pessoa
    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }

    // Getters (opcional, se quiser usar fora da classe)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class Principal {
    public static void main(String[] args) {
        // Criando a lista de pessoas
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Adicionando pessoas à lista
        listaDePessoas.add(new Pessoa("Ana", 25));
        listaDePessoas.add(new Pessoa("Bruno", 30));
        listaDePessoas.add(new Pessoa("Carlos", 22));

        // Imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // Imprimindo a primeira pessoa da lista
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        // Imprimindo a lista completa
        System.out.println("Lista completa de pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
