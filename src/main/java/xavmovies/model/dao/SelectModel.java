/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xavmovies.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import xavmovies.model.Filme;
import xavmovies.model.Sessao;

/**
 *
 * @author rafael.bahia
 */
public class SelectModel {

    public static List<String> selectFilmeAll() {
        List<String> filmes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            PreparedStatement stmt = connection.prepareStatement("SELECT * from filme");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                String tituloFilme = resultSet.getString("titulo");

                filmes.add(tituloFilme);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return filmes;
    }

    public static List<String> selectSalaAll() {
        List<String> salas = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            PreparedStatement stmt = connection.prepareStatement("SELECT * from sala");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                int identificacao = resultSet.getInt("numeroIdentificacao");
                int capacidade = resultSet.getInt("capacidade");

                salas.add("Identificador: " + String.valueOf(identificacao) + " -  Capacidade: " + String.valueOf(capacidade) + " pessoas");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return salas;
    }

    public static List<Sessao> verifySessionAll() {

        List<Sessao> sessoes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            PreparedStatement stmt = connection.prepareStatement("SELECT * from sessao");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                String horario = resultSet.getString("horario");
                int sala = resultSet.getInt("num_sala");
                String filme = resultSet.getString("nome_filme");
                int ingresso = resultSet.getInt("qntd_ingresso");

                Sessao sessao = new Sessao(horario, ingresso, sala, filme);

                sessoes.add(sessao);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return sessoes;
    }

    public static String verifyAvailableIngresso(int numeroIdentificacao, String horario, String nomefilme) {

        int result = 0;

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("SELECT (sala.capacidade - sessao.qntd_ingresso) as disponivel\n"
                    + "FROM sala JOIN sessao\n"
                    + "ON (sala.numeroIdentificacao=" + numeroIdentificacao + " and sessao.horario = '" + horario + "' and sessao.nome_filme = '" + nomefilme + "')");

            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {

                result = resultSet.getInt("disponivel");

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return String.valueOf(result);
    }

    public static Filme selectFilme(String nome) {

        Filme filme = null;

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            Statement statement = connection.createStatement();

            statement.execute("SELECT * FROM filme WHERE titulo = '" + nome + "'");

            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {

                String duracao = String.valueOf(resultSet.getInt("duracao"));
                String sinopse = resultSet.getString("sinopse");
                String nomeDiretor = resultSet.getString("nomeDiretor");
                String categoria = resultSet.getString("categoria");
                String faixaEtaria = String.valueOf(resultSet.getInt("faixaEtaria"));

                filme = new Filme(nome, duracao, sinopse, nomeDiretor, categoria, faixaEtaria);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return filme;
    }

}
