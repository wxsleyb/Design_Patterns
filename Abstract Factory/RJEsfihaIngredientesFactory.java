public class RJEsfihaIngredientesFactory {

    @Override
    public Massa criarMassa() {
        return new MassaGrossa();
         
    }

    @Override
    public Carne criarCarne() {
        return new Picanha();
        
         
    }

    @Override
    public Molho criarMolho() {
        return new MolhoTomate();
        
        
    }
    
}
