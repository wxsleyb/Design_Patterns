package Composite;

public class Cliente {
    public static void main(String[] args) {
        Departamento empresa = new Departamento("Empresa");
        Departamento departamento1 = new Departamento("Departamento 1");
        Departamento departamento2 = new Departamento("Departamento 2");
        Funcionario funcionario1 = new Funcionario("Funcionário 1");
        Funcionario funcionario2 = new Funcionario("Funcionário 2");

        empresa.addComponente(departamento1);
        empresa.addComponente(departamento2);
        departamento1.addComponente(funcionario1);
        departamento2.addComponente(funcionario2);

        empresa.exibir();
    }
}