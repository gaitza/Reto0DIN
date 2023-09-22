/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    
    public static InterfaceModel getFileModel(){
        String bundle = ResourceBundle.getBundle("app.option").getString("model");
        
        if (bundle.equals("file")) {
           return new FileModelImplementation();
        } else {
            return new BDModelImplementation();
        }
    }
}
