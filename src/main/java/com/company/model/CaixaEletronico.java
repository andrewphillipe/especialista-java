package com.company.model;

public class CaixaEletronico {

    public static final double VALOR_IMPRESSAO_DEMONSTRATIVO = 5;

    public boolean transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {

        System.out.printf("Valor R$ %.2f transferido da conta %d/%d p/ conta %d/%d%n", valorTransferencia,
                contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
        contaOrigem.imprimirDemonstrativo();

        return true;

    }

    public void imprimirDemonstrativo(Conta conta) {
        if (conta.possuiGratuidadeImpressao()) {
            System.out.println("Sem custo de impressao demonstrativo");
        } else {
            debitarCustoImpressao(conta);
        }
        conta.imprimirDemonstrativo();
    }

    private void debitarCustoImpressao(Conta conta) {
        System.out.printf("Custo impressao demonstrativo: R$ %.2f%n", VALOR_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(VALOR_IMPRESSAO_DEMONSTRATIVO);
    }
}
