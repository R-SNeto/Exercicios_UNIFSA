package entity;

public class Ingresso {
    private int id;
    private String nomeAtracao;
    private double valorPago;
    private static int contadorGeral;

    public Ingresso() {
    }

    public Ingresso(String nomeAtracao, double valorPago) {
        this.id = contadorGeral;
        contadorGeral += 1;
        this.nomeAtracao = nomeAtracao;
        this.valorPago = valorPago;
    }

    public static int getTotalEmitido() {
        return contadorGeral;
    }

    public int getId() {
        return id;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public double getValorPago() {
        return valorPago;
    }
}
