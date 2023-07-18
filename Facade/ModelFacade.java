public class ModelFacade {

    private Cliente cliente;
    private DataBase conta;

    public ModelFacade() {
        this.setCliente(new Cliente());
        this.setConta(new DataBase());
    }

    public void Deposito(int qtd, Cliente cliente, DataBase conta) {
        System.out.printf("Olá %s \n", cliente.getNome());
        System.out.printf("Saldo da conta antes do deposito: %d \n", conta.getSaldo());
        System.out.printf("Seu depósito é de: %d \n", qtd);
        conta.depositar(qtd);
        System.out.printf("Saldo da conta depois do deposito: %d \n", conta.getSaldo());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DataBase getConta() {
        return conta;
    }

    public void setConta(DataBase conta) {
        this.conta = conta;
    }

}