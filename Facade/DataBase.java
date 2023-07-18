public class DataBase {
    private String conta;
    private int saldo;

    public int depositar(int valor) {
        return this.setSaldo(this.getSaldo() + valor);
    }

    public int getSaldo() {
        return saldo;
    }

    public int setSaldo(int saldo) {
        return this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public DataBase() {
    }

    public DataBase(String conta) {
        this.conta = conta;
    }

}