/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author bayron Factoria para construir el modelo.
 */
public class ModelFactory {

    /**
     * Metodo que lee un properties para deliberar si crear un modelo u otro, en
     * base al valor que lee
     *
     * @return Devuelve un modelo ya construido.
     */
    public static InterfaceModel getFileModel() {
        String bundle = ResourceBundle.getBundle("app.option").getString("model");

        if (bundle.equalsIgnoreCase("file")) {
            return new FileModelImplementation();
        } else {
            return new BDModelImplementation();
        }
    }
}
