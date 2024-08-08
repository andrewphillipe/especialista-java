import com.company.model.*;

import java.util.Locale;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Titular titular = new Titular("Pedro", "12345678");
        Titular titular2 = new Titular("Pedro", "12345678");

        ContaEspecial contaEspecial = new ContaEspecial(titular, 4321, 6665, 50.0);
        contaEspecial.depositar(100);
        contaEspecial.creditarRendimentos(10);

        ContaInvestimento contaInvestimento = new ContaInvestimento(titular2, 4321, 6666);
        contaInvestimento.depositar(100);
        contaInvestimento.creditarRendimentos(5);

        Conta conta = new Conta(titular2, 4321, 6666);
        conta.depositar(50);

        ContaSalario contaSalario = new ContaSalario(titular2, 4321, 6666, 1430);
        contaSalario.depositar(50);

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.imprimirDemonstrativo(contaEspecial);


    }
}

