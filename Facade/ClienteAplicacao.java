public class ClienteAplicacao {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Wesley Braga de Faria");
		DataBase conta = new DataBase("00001");
		
		ModelFacade facade = new ModelFacade();
		facade.Deposito(1000, cliente, conta);
	}

}
