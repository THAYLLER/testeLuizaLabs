package com.teste.tecnico.luiza.labs.models;

import java.io.Serializable;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
@JsonIgnoreProperties(ignoreUnknown = true)
public class Nfe implements Serializable{
    
    private static final long serialVersionUID = 1L;
     
    private Long id;
    private Long CnpjCpf,Numero;
    private int Serie, Modelo;
    private String Chave,Status,Tipo,Data;
    private double ValorTotal,ValorProd,ValorICMS,ValorIPI;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public Long getCnpjCpf() {
        return CnpjCpf;
    }

    public void setCnpjCpf(Long CnpjCpf) {
        this.CnpjCpf = CnpjCpf;
    }

    public Long getNumero() {
        return Numero;
    }

    public void setNumero(Long Numero) {
        this.Numero = Numero;
    }

    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public String getChave() {
        return Chave;
    }

    public void setChave(String Chave) {
        this.Chave = Chave;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public double getValorProd() {
        return ValorProd;
    }

    public void setValorProd(double ValorProd) {
        this.ValorProd = ValorProd;
    }

    public double getValorICMS() {
        return ValorICMS;
    }

    public void setValorICMS(double ValorICMS) {
        this.ValorICMS = ValorICMS;
    }

    public double getValorIPI() {
        return ValorIPI;
    }

    public void setValorIPI(double ValorIPI) {
        this.ValorIPI = ValorIPI;
    }

}
