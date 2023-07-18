package Prototype;

public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public Funcionario clone() {
        return new Funcionario(getNome(), getMatricula());
    }
}
