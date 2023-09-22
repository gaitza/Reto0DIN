/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;
import view.FXMLController;
import view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application extends javafx.application.Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Controller().run(ModelFactory.getFileModel(), ViewFactory.getView());
        //new Controller(),run(ModelFactory.getModel(),
                //            ViewFactory,getView());
    }

    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
       //Loas FXML view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root=loader.load();
        FXMLController viewController=loader.getController();
        viewController.setGreeting(greeting);
        //Create a Scene for view
        Scene scene=new Scene(root);
        //Put the view on Stage
        primaryStage.setScene(scene);
        //Show the Stage
        primaryStage.showAndWait();
    }
    
}
