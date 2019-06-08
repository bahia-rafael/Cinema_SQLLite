/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xavmovies.model;

/**
 *
 * @author RAFAELDEOLIVEIRABAHI
 */
public class Sessao {

    private String horario;
    private int qntd_ingresso;
    private int sala;
    private String filme;

    public Sessao(String horario, int qntd_ingresso, int sala, String filme) {
        this.horario = horario;
        this.qntd_ingresso = qntd_ingresso;
        this.sala = sala;
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQntd_ingresso() {
        return qntd_ingresso;
    }

    public void setQntd_ingresso(int qntd_ingresso) {
        this.qntd_ingresso = qntd_ingresso;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

}
