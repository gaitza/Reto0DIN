/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class FileModelImplementation implements InterfaceModel{

    @Override
    public String getgreeting() {
                
        ResourceBundle bundle = ResourceBundle.getBundle("model.PropertiesFile");
        
        String saludo = bundle.getString("message");
        return saludo;
    }
    
    
    
}
