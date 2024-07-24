import com.company.model.Conta;
import com.company.model.ContaEspecial;
import com.company.model.ContaInvestimento;
import com.company.model.Titular;

import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

//        Titular titular = new Titular("João", "12365478945");
//        Conta conta = new Conta(titular, 123456, 4445);
//        conta.depositar(100);
//        conta.sacar(200);
//        conta.imprimirDemonstrativo();


        Titular titular = new Titular("João", "12365478945");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 123456, 4445, 5.0D, 10.0D, 500.0D);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);
        contaEspecial.sacar(500);
        contaEspecial.setTarifaMensal(90);
        contaEspecial.debitarTarifaMensal();
        contaEspecial.imprimirDemonstrativo();

        Titular titular2 = new Titular("Pedro", "12365478946");

        ContaInvestimento contaInvestimento = new ContaInvestimento(titular2, 123456, 4445, 5.0D);
        contaInvestimento.creditarRendimentos(10);
//        contaInvestimento.imprimirDemonstrativo();


    }
}

