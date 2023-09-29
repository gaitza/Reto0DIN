package model;

import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
;

public class ModelFactoryTest {

     @Test
   public void testGetFileModel() throws IOException {
        // Define un archivo de propiedades simulado para la prueba.
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("model", "file");

        // Simula el ResourceBundle
        java.util.ResourceBundle bundle = new java.util.PropertyResourceBundle(new java.io.ByteArrayInputStream(properties.toString().getBytes()));

        // Reemplaza el ResourceBundle de la clase ModelFactory con el simulado
        java.lang.reflect.Field field;
        try {
            field = model.ModelFactory.class.getDeclaredField("bundle");
            field.setAccessible(true);
            field.set(null, bundle);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // Prueba si getFileModel() devuelve una instancia de FileModelImplementation
        InterfaceModel model = ModelFactory.getFileModel();
        assertTrue(model instanceof model.FileModelImplementation);
    }
}
