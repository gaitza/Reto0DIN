/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.InterfaceModel;
import view.InterfaceView;

/**
 *
 * @author bayron 
 * Controlador encargado de lanzar la aplicacion 
 */
public class Controller {

    /**
     * @param model La interfaz de modelo ya construido.
     * @param view La interfaz de vista ya construida.
     *
     */
    public void run(InterfaceModel model, InterfaceView view) {

        view.showgreeting(model.getgreeting());
    }

}
