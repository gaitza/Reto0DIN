/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class ViewImplementation extends javafx.application.Application implements InterfaceView{

    @FXML 
    public TextField textfield_message;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
         //Loas FXML view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root=loader.load();
        
        ViewImplementation viewControler = loader.getController();
        
        //Create a Scene for view
        Stage stage = new Stage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        viewControler.textfield_message.setText(getParameters().getRaw().get(0));
        
        stage.show();
    }

    @Override
    public void showgreeting(String greeting) {
       String [] args = new String[1];
       args[0] = greeting;
       launch(args);
    }
    
}
