package com.company;

import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    public void exibirTransacao() {
    }

    public enum TipoTransacao {
        RECEITA, DESPESA
    }

    public Transacao(String descricao, double valor, TipoTransacao tipo){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }
}


