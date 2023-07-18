public class SPEsfihaIngredientesFactory extends EsfihaIngredientesFactory{

    @Override
    public Massa criarMassa() {
        return new MassaFina();
         
    }

    @Override
    public Carne criarCarne() {
        return new Alcatra();
        
         
    }

    @Override
    public Molho criarMolho() {
        return new MolhoEspanhol();
        
        
    }

    


    
}
