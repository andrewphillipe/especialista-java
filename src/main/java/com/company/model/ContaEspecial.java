package com.company.model;

public class ContaEspecial extends ContaInvestimento {

    protected double tarifaMensal;
    protected double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double valorTotalRendimentos, double tarifaMensal, double limiteChequeEspecial) {
        super(titular, agencia, numero, valorTotalRendimentos);
        this.tarifaMensal = tarifaMensal;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal() {

    }

    public double valorDisponivel() {
        return this.saldo + limiteChequeEspecial;
    }

    @Override
    public void sacar(double valorsaque) {
        if (valorDisponivel() < valorsaque) {
            throw new IllegalStateException(String.format("Saldo da conta menor que o valor solicitado. Saldo em conta: %.2f", saldo));
        }

        this.saldo = this.saldo - valorsaque;

    }

    @Override
    public void imprimirDemonstrativo() {
        System.out.println("Nome do titular: " + this.titular.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.numero);
        System.out.printf("Saldo da conta: R$ %.2f%n", this.saldo);
    }

}
