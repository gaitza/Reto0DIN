/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bayron
 * Clase Greeting con sus atributos y tus getters y setters.
 */
public class Greeting {
    
    private String value;
    
    public Greeting (){
        
    }
    
    public Greeting (String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
    
    public void setValue(String value){
        this.value=value;
    }
    
}
