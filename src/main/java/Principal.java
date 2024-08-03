import com.company.model.Conta;
import com.company.model.Titular;

import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Titular titular = new Titular("Pedro", "12345678");

        Titular titular2 = new Titular("Pedro", "12345678");

        Conta conta1 = new Conta(titular, 1234, 12345678);
        Conta conta2 = new Conta(titular, 1234, 12345678);

        System.out.println(conta1.equals(conta1));

    }
}

