public class Esfiha{
    private Esfiha esfiha;

    public void criarProduto(
        String estado,
        String tipo
    ){
        if(tipo.equals("carne")){
            esfiha = new EsfihaCarne(getIngredientes(estado));
        }
    }
        
        private EsfihaIngredientesFactory getIngredientes(String estado){
            if(estado.equals("RJ")){
                return new RJEsfihaIngredientesFactory();
            } else {
                return new SPEsfihaIngredientesFactory();
            }
        }
    

    private Object getIngredientes(String estado) {
        return null;
    }
}