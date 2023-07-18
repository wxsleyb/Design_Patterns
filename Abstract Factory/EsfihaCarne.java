public class EsfihaCarne extends Esfiha {
    private PizzaIngredientesFactory ingredientes;
    private String estado;
    private Massa massa;
    private Carne carne;
    private Molho molho;

    public EsfihaCarne(PizzaIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void prepara() {

        massa = ingredientes.criarMassa();
        carne = ingredientes.criarCarne();
        molho = ingredientes.criarMolho();
    }

}



