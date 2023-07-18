public class Singleton {
	
	private static String nome;
	private static String idade;
	private static Singleton instance;
	
	Singleton(String nome, String idade) {
		Singleton.setNome(nome);
		Singleton.setIdade(idade);
	}
	
	public synchronized static Singleton getInstance(String nome, String idade) {
		
		if(instance == null) {
			instance = new Singleton(nome, idade);
		}
		return instance;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Singleton.nome = nome;
	}

	public static String getIdade() {
		return idade;
	}

	public static void setIdade(String idade) {
		Singleton.idade = idade;
	}

}
