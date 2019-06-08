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
import xavmovies.model.Sala;
import xavmovies.model.Sessao;

/**
 *
 * @author rafael.bahia
 */
public class InsertModel {

    public static boolean insertFilme(Filme filme) {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO filme(titulo, duracao, sinopse, nomeDiretor, categoria, faixaEtaria) VALUES ('" + filme.getTitulo() + "', " + filme.getDuracao() + ", '" + filme.getSinopse() + "', '" + filme.getNomeDiretor() + "', '" + filme.getCategoria() + "', " + filme.getFaixaEtaria() + ")");

            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public static boolean insertSala(Sala sala) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO sala (numeroIdentificacao, capacidade, tipo) VALUES (" + sala.getIdentificacao() + ", " + sala.getCapacidade() + ", '" + sala.getTipo() + "')");

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return false;
        }
    }

    public static boolean insertSessao(Sessao sessao) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO sessao (horario, num_sala, nome_filme) VALUES ('" + sessao.getHorario() + "', " + sessao.getSala() + ", '" + sessao.getFilme() + "')");

            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
