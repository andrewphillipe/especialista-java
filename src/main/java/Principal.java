public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.setModelo("HRV");
        meuCarro.setAnoFabricacao(2021);

        System.out.printf("Modelo: %s%n", meuCarro.getModelo());
        System.out.printf("Ano: %d%n", meuCarro.getAnoFabricacao());


        Carro seuCarro = new Carro();

        seuCarro.setModelo("HRV");
        seuCarro.setAnoFabricacao(2021);

        System.out.printf("Modelo: %s%n", seuCarro.getModelo());
        System.out.printf("Ano: %d%n", seuCarro.getAnoFabricacao());
    }

}

