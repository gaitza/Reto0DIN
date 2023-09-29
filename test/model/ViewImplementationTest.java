/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javafx.scene.control.TextField;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import view.ViewImplementation;

/**
 *
 * @author 2dam
 */
public class ViewImplementationTest {

    private ViewImplementation viewImplementation;

    @Before
    public void setUp() throws Exception {
        viewImplementation = new ViewImplementation();
    }


    @Test
    public void testShowGreeting() {
        // Prueba del método showGreeting
        String greeting = "Saludo";
        viewImplementation.showgreeting(greeting);

        // Verificar el comportamiento esperado después de llamar a showgreeting
        // Puedes agregar aserciones adicionales según el comportamiento esperado.
    }

    @Test
    public void testTextFieldConfiguration() {
        ViewImplementation view = new ViewImplementation();

        view.textfield_message = new TextField();
        String mensaje = "Hello world";
        view.textfield_message.setText(mensaje);

        assertEquals(mensaje, view.textfield_message.getText());
    }
}
