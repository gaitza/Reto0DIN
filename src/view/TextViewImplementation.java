/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 2dam
 */
public class TextViewImplementation implements InterfaceView{

    @Override
    public void showgreeting(String greeting) {
        System.out.println(greeting);
    }
    
}