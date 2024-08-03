package com.company.model;

public class ContaEspecial extends ContaInvestimento {

    protected double tarifaMensal;
    protected double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    public double valorDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    protected void preValidarValorSaque(double valorSaque) {
        if (valorDisponivel() < valorSaque) {
            throw new IllegalStateException(String.format("Saldo da conta menor que o valor solicitado. Saldo em conta: %.2f", saldo));
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
