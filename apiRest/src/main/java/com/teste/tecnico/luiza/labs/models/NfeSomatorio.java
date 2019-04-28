package com.teste.tecnico.luiza.labs.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfeSomatorio {
    
    private static final long serialVersionUID = 1L;
     
    private Long id;
    private double somaValorTotal,somaValorProd,somaValorICMS,somaValorIPI;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSomaValorTotal() {
        return somaValorTotal;
    }

    public void setSomaValorTotal(double somaValorTotal) {
        this.somaValorTotal = somaValorTotal;
    }

    public double getSomaValorProd() {
        return somaValorProd;
    }

    public void setSomaValorProd(double somaValorProd) {
        this.somaValorProd = somaValorProd;
    }

    public double getSomaValorICMS() {
        return somaValorICMS;
    }

    public void setSomaValorICMS(double somaValorICMS) {
        this.somaValorICMS = somaValorICMS;
    }

    public double getSomaValorIPI() {
        return somaValorIPI;
    }

    public void setSomaValorIPI(double somaValorIPI) {
        this.somaValorIPI = somaValorIPI;
    }
    
    
}
