package model;

import model.exception.IngressoEsgotadoException;

public class Setor {

    private final String nome;
    private final int capacidade;
    private int vendidos;

    public Setor(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.vendidos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getVendidos() {
        return vendidos;
    }

    public int getRestantes() {
        return capacidade - vendidos;
    }

    public void vender(int quantidade) throws IngressoEsgotadoException {
        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "Quantidade inválida: " + quantidade + ". Informe um número maior que zero.");
        }
        if (quantidade > getRestantes()) {
            throw new IngressoEsgotadoException(
                    "Ingressos insuficientes no setor " + nome + ": pedido de "
                            + quantidade + ", restam " + getRestantes() + ".",
                    getRestantes());
        }
        vendidos += quantidade;
    }
}
