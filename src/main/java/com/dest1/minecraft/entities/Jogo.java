package com.dest1.minecraft.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jogo {
    @Id
    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private int anoLancamento;
    private String imagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String descricao;

    public Jogo(){}

    public Jogo(String nome, String descricao, String imagem, int anoLancamento, String plataforma, String genero) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
        this.genero = genero;
    }
}
