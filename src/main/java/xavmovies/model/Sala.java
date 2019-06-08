/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xavmovies.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAFAELDEOLIVEIRABAHI
 */
public abstract class Sala {

    private int identificacao;
    private int capacidade;

    public abstract double valorIngresso();

    public Sala(int identificacao, int capacidade) {
        this.identificacao = identificacao;
        this.capacidade = capacidade;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract String getTipo();

}
