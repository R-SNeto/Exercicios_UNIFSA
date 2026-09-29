package entity;

public class AtracaoFestival {
    private String nome;
    private String horario;
    private double cache;
    private double valorIngresso;
    private int capacidadePublico;
    private int ingressosVendidos;



    public AtracaoFestival() {
        this.ingressosVendidos = 0;
    }

    public AtracaoFestival(String nome, String horario, double cache, double valorIngresso, int capacidadePublico) {
        this();
        this.nome = nome;
        this.horario = horario;
        this.cache = cache;
        this.valorIngresso = valorIngresso;
        this.capacidadePublico = capacidadePublico;
    }


    public boolean venderIngresso(int quantidade) {
        if (ingressosVendidos >= capacidadePublico) return false;

        if ((ingressosVendidos + quantidade) > capacidadePublico) {
            return false;
        } else {
            ingressosVendidos += quantidade;
            return true;
        }
    }

    public int getIngressosDisponiveis() {
        return capacidadePublico - ingressosVendidos;
    }

    public double calcularReceita() {
        return valorIngresso * ingressosVendidos;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    @Override
    public String toString() {
        return "Atração: " + nome
                + "Horário: " + horario;
    }
}
