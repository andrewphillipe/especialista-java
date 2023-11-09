import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Pessoa proprietario = new Pessoa();
        proprietario.setNome("Joao");
        proprietario.setCpf("111.111.111-11");
        proprietario.setAnoNascimento(1985);

        Carro carro = new Carro();
        carro.setAnoFabricacao(2021);
        carro.setCor("Verde");
        carro.setFabricante("Honda");
        carro.setModelo("HR-V");
        carro.setPrecoCompra(100000.0);
        carro.setProprietario(proprietario);

        System.out.println("Tempo de uso: " + carro.calcularTempoDeUso());
        System.out.printf("Valor de revenda: R$ %.2f%n", carro.calcularValorRevenda());
    }

}

