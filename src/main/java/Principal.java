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
        carro.setProprietario(proprietario);


    }

}

