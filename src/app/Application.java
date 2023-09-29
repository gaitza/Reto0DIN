/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.Controller;
import model.ModelFactory;

import view.ViewFactory;

/**
 *
 * @author bayron
 * Main de la aplicacion para lanzarla. Aqui solo llamamos al metodo run del controlador
 */
public class Application  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Se crea una instancia de Controller y se llama al método "run" con un modelo de archivo y una vista.
        new Controller().run(ModelFactory.getFileModel(), ViewFactory.getView());   
    }

}
