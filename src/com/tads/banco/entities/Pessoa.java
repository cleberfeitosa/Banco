package com.tads.banco.entities;
public class Pessoa {
    private String nome;
    private String documento;

    public Pessoa(){

    }

    public Pessoa(String nome, String documento){
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
