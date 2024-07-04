package com.company.model;

public class ContaInvestimento extends Conta {

    protected double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero, double valorTotalRendimentos) {
        super(titular, agencia, numero);
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = (getSaldo() * percentualJuros) / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(this.valorTotalRendimentos);
    }

}
