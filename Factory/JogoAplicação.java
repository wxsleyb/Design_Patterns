public class JogoAplicação extends Aplicação{

    @Override
    public Programa createPrograma() {
       return new JogoPrograma();
    }
    
}
