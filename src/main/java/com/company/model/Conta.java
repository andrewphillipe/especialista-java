package com.company.model;

public class Conta {

    protected Titular titular;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this(0);
    }

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public boolean possuiGratuidadeImpressao() {
        return false;
    }

    protected void preValidarValorSaque(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalStateException("Valor do saque deve ser maior que 0");
        }

        if (getSaldo() < valorSaque) {
            throw new IllegalStateException(String.format("Saldo da conta menor que o valor solicitado. Saldo em conta: %.2f", getSaldo()));
        }
    }

    public void sacar(double valorsaque) {
        preValidarValorSaque(valorsaque);
        this.saldo -= valorsaque;
    }

    public final void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalStateException("Valor do depósito nao pode ser menor que 1: ");
        }

        this.saldo += valorDeposito;

    }

    public void imprimirDemonstrativo() {
        System.out.println("Nome do titular: " + titular.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.printf("Saldo da conta: %.2f%n", this.saldo);

    }

    public double valorDisponivel() {
        return getSaldo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (this.getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        if (this.getAgencia() != conta.getAgencia()) return false;
        if (this.getNumero() != conta.getNumero()) return false;
        if (this.getTitular() != conta.getTitular()) return false;

        return true;

    }

}
