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

/**
 *
 * @author rafael.bahia
 */
public class UpdateModel {

    public static boolean vendaIngresso(int numeroIdentificacao, String horario, String nomefilme, int qntd_ingresso) {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("UPDATE sessao SET qntd_ingresso = qntd_ingresso + " + qntd_ingresso + " WHERE (sessao.num_sala=" + numeroIdentificacao + " and sessao.horario = '" + horario + "' and sessao.nome_filme = '" + nomefilme + "')");

            JOptionPane.showMessageDialog(null, "Comprado com sucesso");

            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
