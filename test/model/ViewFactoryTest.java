package model;

import java.io.IOException;
import java.util.ResourceBundle;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import view.InterfaceView;
import view.TextViewImplementation;
import view.ViewFactory;

public class ViewFactoryTest {
    
    @Test
   public void testGetView() throws IOException {
        // Define un archivo de propiedades simulado para la prueba.
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("view", "text");

        // Simula el ResourceBundle
        java.util.ResourceBundle bundle = new java.util.PropertyResourceBundle(new java.io.ByteArrayInputStream(properties.toString().getBytes()));

        // Reemplaza el ResourceBundle de la clase ViewFactory con el simulado
        java.lang.reflect.Field field;
        try {
            field = view.ViewFactory.class.getDeclaredField("bundle");
            field.setAccessible(true);
            field.set(null, bundle);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // Prueba si getView() devuelve una instancia de TextViewImplementation
        InterfaceView view = ViewFactory.getView();
        assertTrue(view instanceof view.TextViewImplementation);
    }
      @Test
   public void testGetWindow() throws IOException {
        // Define un archivo de propiedades simulado para la prueba.
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("view", "window");

        // Simula el ResourceBundle
        java.util.ResourceBundle bundle = new java.util.PropertyResourceBundle(new java.io.ByteArrayInputStream(properties.toString().getBytes()));

        // Reemplaza el ResourceBundle de la clase ViewFactory con el simulado
        java.lang.reflect.Field field;
        try {
            field = view.ViewFactory.class.getDeclaredField("bundle");
            field.setAccessible(true);
            field.set(null, bundle);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // Prueba si getView() devuelve una instancia de TextViewImplementation
        InterfaceView view = ViewFactory.getView();
        assertTrue(view instanceof view.TextViewImplementation);
    }
}
