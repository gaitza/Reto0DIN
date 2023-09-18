/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.FileModelImplementation;
import modelo.InterfaceModel;
import modelo.InterfaceView;
import modelo.ModelFactory;

/**
 *
 * @author 2dam
 */
public class Controller {
    
    public void run(InterfaceView view, InterfaceModel model){
      
        view.showgreeting(model.getgreeting());
    }
    
}
