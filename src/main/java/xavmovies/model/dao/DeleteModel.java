/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xavmovies.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import xavmovies.model.Filme;

/**
 *
 * @author RAFAELDEOLIVEIRABAHI
 */
public class DeleteModel {

    public static boolean deleteFilme(Filme filme) {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("DELETE FROM filme WHERE titulo = '" + filme.getTitulo() + "'");

            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
