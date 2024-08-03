package com.company.model;

public class ContaInvestimento extends Conta {

    protected double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = (getSaldo() * percentualJuros) / 100;
        this.valorTotalRendimentos += valorRendimentos;

        if (this.valorTotalRendimentos > 0) {
            depositar(this.valorTotalRendimentos);
        }
    }

}
