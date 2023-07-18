import java.util.HashMap;
import java.util.Map;

public class Invoker {
	
	public static Map<String, Command> comandoLampadas = new HashMap<String, Command>();
	
	static {
		comandoLampadas.put("A", new LampadaACommand());
		comandoLampadas.put("B", new LampadaBCommand());

	}
	public static void invokeComando(String comando) {
		try {
		comandoLampadas.get(comando).executar();
		} catch(Exception e) {
			System.out.println("Comando não encontrado");
		}
	}

}