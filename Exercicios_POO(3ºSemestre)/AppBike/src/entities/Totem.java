package entities;

public class Totem {
    private String nomeEstacao;
    private int qtdBikes;
    private double tarifaPorMin;

    public Totem() {
    }

    public Totem(String nomeEstacao, int qtdBikes, double tarifaPorMin) {
        this.nomeEstacao = nomeEstacao;
        this.qtdBikes = qtdBikes;
        this.tarifaPorMin = tarifaPorMin;
    }

    public double valorTotalCorrida(int duracaoCorrida) {
        return tarifaPorMin * duracaoCorrida;
    }

    public String getNomeEstacao() {
        return nomeEstacao;
    }

    @Override
    public String toString() {
        return "Nome da estação: " + nomeEstacao + "\n"
                + "Quantidade de bicicletas disponíveis: " + qtdBikes + "\n"
                + "Valor da tarifa por minuto: " + tarifaPorMin;
    }
}
