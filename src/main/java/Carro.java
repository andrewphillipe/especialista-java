import java.time.LocalDate;
import java.util.Locale;

public class Carro {

    private static final int VIDA_UTIL_ANOS = 20;

    private String fabricante;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private Pessoa proprietario;
    private Double precoCompra;

    public double calcularValorRevenda() {
        Locale.setDefault(Locale.US);
        int tempoUso = LocalDate.now().getYear() - this.anoFabricacao;
        double valorRevenda = (precoCompra / VIDA_UTIL_ANOS) * (VIDA_UTIL_ANOS - tempoUso);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return  valorRevenda;
    }

    public int calcularTempoDeUso() {
        if (this.anoFabricacao == 0) {
            return anoFabricacao;
        }
        return LocalDate.now().getYear() - this.anoFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
