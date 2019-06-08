/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xavmovies.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import xavmovies.model.Sessao;

/**
 *
 * @author RAFAELDEOLIVEIRABAHI
 */
public class Conexao {

    

    public static void searchSession(String nomeFilme, String numSala, String horarioSessao, int qntdIngresso) {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("UPDATE sessao SET qntd_ingresso = qntd_ingresso + " + qntdIngresso + " WHERE horario = '" + horarioSessao + "' and nome_filme = '" + nomeFilme + "' and num_sala =" + numSala);

            JOptionPane.showMessageDialog(null, "Comprado com sucesso");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
