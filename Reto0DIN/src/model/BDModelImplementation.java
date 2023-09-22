/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class BDModelImplementation implements InterfaceModel {

    private Connection con = null;
    private PreparedStatement stmt;

    final private String get_greeting = "SELECT * FROM greeting";

    public void abrirConexion() {

        try {
            Properties configBDA = new Properties();
            String rutaProyecto = System.getProperty("user.dir");
            FileInputStream fis = new FileInputStream(rutaProyecto + "\\src\\model\\PropertiesBD.properties");
            configBDA.load(fis);

            final String URL = configBDA.getProperty("url");
            final String USER = configBDA.getProperty("user");
            final String PASSWORD = configBDA.getProperty("password");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getgreeting() {

        this.abrirConexion();

        String message = " ";
        try {
            stmt = con.prepareStatement(get_greeting);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                message = rs.getString("message");
            }

        } catch (SQLException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.cerrarConexion();
        return message;
    }

}