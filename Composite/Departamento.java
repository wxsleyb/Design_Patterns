package Composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements ComponenteEmpresa {
    private List<ComponenteEmpresa> componentes = new ArrayList<>();
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void addComponente(ComponenteEmpresa componente) {
        componentes.add(componente);
    }

    public void exibir() {
        System.out.println(nome);
        for (ComponenteEmpresa componente : componentes) {
            componente.exibir();
        }
    }
}
