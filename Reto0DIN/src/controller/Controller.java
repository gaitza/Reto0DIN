/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.FileModelImplementation;
import model.InterfaceModel;
import view.InterfaceView;
import model.ModelFactory;

/**
 *
 * @author 2dam
 */
public class Controller {
    
    public void run(InterfaceModel model, InterfaceView view){
      
        view.showgreeting(model.getgreeting());
    }
    
}
