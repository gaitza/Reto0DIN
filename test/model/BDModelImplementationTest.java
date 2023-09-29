/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template.
 */
package model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


/**
 *
 * @author bayro
 */
public class BDModelImplementationTest {
 @Test
   public void testGetGreeting() {
        // Configuración
        BDModelImplementation model = new BDModelImplementation();

        // Ejecución
        String greeting = model.getgreeting();

        // Comprobación
        assertNotNull(greeting); // Verifica que el saludo no sea nulo
        assertFalse(greeting.isEmpty()); // Verifica que el saludo no esté vacío
    }
}
