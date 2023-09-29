package model;


import org.junit.Test;
import view.InterfaceView;
import view.TextViewImplementation;

public class TextViewImplementationTest {

    @Test
    public void showGreeting() {
        // Configuración
        String greeting = "Hello World!";
        InterfaceView view = new TextViewImplementation();

        // Ejecución
        view.showgreeting(greeting);

        // Comprobación
        // Como este código imprime en la consola, no hay un valor de retorno que podamos verificar.
        // En su lugar, debemos inspeccionar la salida en la consola manualmente.
    }
}
