public abstract class Aplicação {

    public abstract Programa createPrograma();

    public void newPrograma(){
        Programa a = createPrograma();
        a.open();
    }
}
