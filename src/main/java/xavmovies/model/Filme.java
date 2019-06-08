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
public class Filme {

    private String titulo;
    private int duracao;
    private String sinopse;
    private String nomeDiretor;
    private String categoria;
    private int faixaEtaria;

    public Filme(String titulo, String duracao, String sinopse, String nomeDiretor, String categoria, String faixaEtaria) {
        this.titulo = titulo;
        this.duracao = Integer.parseInt(duracao);
        this.sinopse = sinopse;
        this.nomeDiretor = nomeDiretor;
        this.categoria = categoria;
        this.faixaEtaria = Integer.parseInt(faixaEtaria);
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", duracao=" + duracao + ", sinopse=" + sinopse + ", nomeDiretor=" + nomeDiretor + ", categoria=" + categoria + ", faixaEtaria=" + faixaEtaria + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

}
