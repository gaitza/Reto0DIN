/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controlador.Controller;
import modelo.ModelFactory;
import modelo.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        new Controller().run(ModelFactory.getModel(),
                ViewFactory.getView());
    }
    
}
