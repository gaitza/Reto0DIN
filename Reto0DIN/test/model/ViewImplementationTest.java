/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javafx.stage.Stage;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import view.ViewImplementation;

/**
 *
 * @author 2dam
 */
public class ViewImplementationTest  {
    
    private ViewImplementation viewImplementation;

    @Before
    public void setUp() throws Exception {
        viewImplementation = new ViewImplementation();
    }

    @Test
    public void testStart() {
        // Crear un objeto Stage para la prueba
        Stage stage = new Stage(); 
        try {
            viewImplementation.start(stage);
        } catch (Exception e) {
            fail("Error al iniciar la aplicación: " + e.getMessage());
        }
        
    }

    @Test
    public void testShowGreeting() {
        // Prueba del método showGreeting
        String greeting = "Saludo";
        viewImplementation.showgreeting(greeting);
        
        // Verificar el comportamiento esperado después de llamar a showgreeting
        // Puedes agregar aserciones adicionales según el comportamiento esperado.
    }
}
