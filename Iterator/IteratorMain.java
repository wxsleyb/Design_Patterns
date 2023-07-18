import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa("João", 29);
        pessoa1.adicionarEndereco("Rua ZZZ, 678");
        pessoa1.adicionarEndereco("Rua XXX, 876");
        pessoas.add(pessoa1);

        Pessoa pessoa2 = new Pessoa("Maria", 50);
        pessoa2.adicionarEndereco("Rua TTT, 456");
        pessoas.add(pessoa2);

        Pessoa pessoa3 = new Pessoa("José", 40);
        pessoa3.adicionarEndereco("Rua FFF, 123");
        pessoa3.adicionarEndereco("Rua GGG, 321");
        pessoas.add(pessoa3);

        Iterator<Pessoa> iterator = pessoas.iterator();

        while (iterator.hasNext()) {
            Pessoa pessoa = iterator.next();
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());

            ArrayList<String> enderecos = pessoa.getEnderecos();
            if (!enderecos.isEmpty()) {
                String endereco = enderecos.get(0);
                System.out.println("Endereço: " + endereco);
            }

            System.out.println();
        }
    }
}