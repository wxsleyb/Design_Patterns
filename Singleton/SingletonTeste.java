public class SingletonTeste {
	
	public static void main(String[] args) {
		var pessoa1 = Singleton.getInstance("Wesley", "21");
		var pessoa2 = Singleton.getInstance("Wesleasdasdds", "25");

		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
	}
    
}
