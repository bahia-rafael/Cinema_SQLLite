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
public class Sala2D extends Sala {

    public Sala2D(int identificacao, int capacidade) {
        super(identificacao, capacidade);
    }

    @Override
    public double valorIngresso() {
        return 25;
    }

    @Override
    public String getTipo() {
        return "2D";
    }

}
