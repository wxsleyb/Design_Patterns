import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private ArrayList<String> enderecos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<String>();
    }

    public void adicionarEndereco(String endereco) {
        this.enderecos.add(endereco);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<String> getEnderecos() {
        return enderecos;
    }
}
