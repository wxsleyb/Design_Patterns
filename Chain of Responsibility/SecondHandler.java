

import java.util.Objects;


public class SecondHandler {
    public void handle(String request) {
        if (Objects.nonNull(request) && request.contains("segundo")) {
            System.out.println("Esta requisição é tratada pelo SegundoHandler.");
        } else {
            // Passa a requisição para o próximo handler da cadeia, se houver
            if (getNext() != null) {
                ((SecondHandler) getNext()).handle(request);
            }
        }
    }

    private Object getNext() {
        return null;
    }
}


