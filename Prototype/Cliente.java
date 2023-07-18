package Prototype;

public class Cliente {
    public static void main(String[] args) {
        Funcionario funcionarioOriginal = new Funcionario("Wesley", 2021999);
        Funcionario funcionarioClone = funcionarioOriginal.clone();

        System.out.println("Funcionário original: " + funcionarioOriginal.getNome() + " - " + funcionarioOriginal.getMatricula());
        System.out.println("Funcionário clonado: " + funcionarioClone.getNome() + " - " + funcionarioClone.getMatricula());
    }
}
