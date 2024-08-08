package com.company.model;

public class ContaEspecial extends ContaInvestimento {

    protected double tarifaMensal;
    protected double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    @Override
    public boolean possuiGratuidadeImpressao() {
        return tarifaMensal > 0;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    public double valorDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    protected void preValidarValorSaque(double valorSaque) {
        if (valorDisponivel() < valorSaque) {
            throw new IllegalStateException(String.format("Saldo disponivel menor que o valor solicitado." +
                    " Saldo disponivel em conta: %.2f", valorDisponivel()));
        }
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo Disponível: R$ %.2f%n", valorDisponivel());
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }
}
