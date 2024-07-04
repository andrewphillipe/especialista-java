import com.company.model.ContaEspecial;
import com.company.model.ContaInvestimento;
import com.company.model.Titular;

import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Titular titular = new Titular("João", "12365478945");

        ContaEspecial contaEspecial = new ContaEspecial(titular, 123456, 4445, 5.0D, 10.0D, 500.0D);
        contaEspecial.sacar(500);
//        contaEspecial.imprimirDemonstrativo();

        Titular titular2 = new Titular("Pedro", "12365478946");

        ContaInvestimento contaInvestimento = new ContaInvestimento(titular2, 123456, 4445, 5.0D);
        contaInvestimento.creditarRendimentos(10);
        contaInvestimento.imprimirDemonstrativo();


    }
}

