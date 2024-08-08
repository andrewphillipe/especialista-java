package com.company.model;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public boolean possuiGratuidadeImpressao() {
        return getValorTotalRendimentos() > 0;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = (getSaldo() * percentualJuros) / 100;
        this.valorTotalRendimentos += valorRendimentos;

        if (this.valorTotalRendimentos > 0) {
            depositar(this.valorTotalRendimentos);
        }
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void setValorTotalRendimentos(double valorTotalRendimentos) {
        this.valorTotalRendimentos = valorTotalRendimentos;
    }
}
