
package model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FileModelImplementationTest {

  @Test
    public void getGreeting() {
        // Configuración
        InterfaceModel model = new FileModelImplementation();

        // Ejecución
        String greeting = model.getgreeting();

        // Comprobación
        assertEquals("Hello World", greeting); // Asegúrate de ajustar el saludo según lo que esperas en tu archivo de propiedades.
    }
}
