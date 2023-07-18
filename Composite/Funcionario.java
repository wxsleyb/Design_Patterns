package Composite;

public class Funcionario implements ComponenteEmpresa {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println(nome);
    }
}

