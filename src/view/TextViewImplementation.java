/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author bayron
 * Implementacion de la interfaz de la vista y los metodos que hereda de esta.
 */
public class TextViewImplementation implements InterfaceView{
    /**
     * @param greeting Un string con el saludo Metodo encargado de mostrar el
     * mensaje que recibe por parametro. Mostrandolo por consola.
     *
     */
    @Override
    public void showgreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
