package com.company.model;

public class ContaInvestimento extends Conta {

    protected double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero, double valorTotalRendimentos) {
        super(titular, agencia, numero);
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        this.valorTotalRendimentos = (valorTotalRendimentos * percentualJuros) / 100;
    }

}
