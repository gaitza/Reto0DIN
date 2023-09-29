/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;
import model.BDModelImplementation;
import model.FileModelImplementation;

/**
 *
 * @author 2dam
 */
public class ViewFactory {

    public static InterfaceView getView() {
        String bundle = ResourceBundle.getBundle("app.option").getString("view");
        if (bundle.equalsIgnoreCase("text")) {
            return new TextViewImplementation();
        } else {
            return new ViewImplementation();
        }
    }
}
