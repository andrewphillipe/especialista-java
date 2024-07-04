package com.company.model;

public class Conta {

    protected Titular titular;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void sacar(double valorsaque) {
        if (this.saldo < valorsaque) {
            throw new IllegalStateException(String.format("Saldo da conta menor que o valor solicitado. Saldo em conta: %.2f", saldo));
        }

        this.saldo -= valorsaque;

    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < 1) {
            throw new IllegalStateException("Valor do depósito nao pode ser menor que 1: ");
        }

        this.saldo += valorDeposito;

    }

    public void imprimirDemonstrativo() {
        System.out.println("Nome do titular: " + titular.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.printf("Saldo da conta: %.2f", this.saldo);
    }


}
