
import java.util.Objects;

public class FirstHandler {
    public void handle(String request) {
        if (Objects.nonNull(request) && request.contains("primeiro")) {
            System.out.println("Esta requisição é tratada pelo PrimeiroHandler.");
        } else {
            // Passa a requisição para o próximo handler da cadeia, se houver
            if (getNext() != null) {
                ((FirstHandler) getNext()).handle(request);
            }
        }
    }

    private Object getNext() {
        return null;
    }
}
