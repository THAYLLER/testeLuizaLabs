package com.teste.tecnico.luiza.labs.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfeTranSefaz {
    
    private static final long serialVersionUID = 1L;
     
    private Long id;
    String Stado;
    int qtdErro,qtdSucesso,qtdeRejeitado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStado() {
        return Stado;
    }

    public void setStado(String Stado) {
        this.Stado = Stado;
    }

    public int getQtdErro() {
        return qtdErro;
    }

    public void setQtdErro(int qtdErro) {
        this.qtdErro = qtdErro;
    }

    public int getQtdSucesso() {
        return qtdSucesso;
    }

    public void setQtdSucesso(int qtdSucesso) {
        this.qtdSucesso = qtdSucesso;
    }

    public int getQtdeRejeitado() {
        return qtdeRejeitado;
    }

    public void setQtdeRejeitado(int qtdeRejeitado) {
        this.qtdeRejeitado = qtdeRejeitado;
    }
    
    
}
