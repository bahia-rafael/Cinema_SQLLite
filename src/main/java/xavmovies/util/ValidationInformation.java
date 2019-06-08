/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xavmovies.util;

/**
 *
 * @author RAFAELDEOLIVEIRABAHI
 */
public class ValidationInformation {

    public static void main(String[] args) {

        String teste = "Identificador: 123 - Capacidade: 50 pessoas";
        String[] textoSeparado = teste.split(" ");
        System.out.println(textoSeparado[1]);
    }

}
