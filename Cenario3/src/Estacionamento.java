package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Carro> vagas;
    private int vagasDisponiveis;
    private int totalEntradas;
    private int totalSaidas;

    public Estacionamento() {
        this.vagas = new ArrayList<>();
        this.vagasDisponiveis = 10;
        this.totalEntradas = 0;
        this.totalSaidas = 0;
    }

    public boolean adicionarCarro(Carro carro) {
        if (vagasDisponiveis > 0) {
            vagas.add(carro);
            vagasDisponiveis--;
            totalEntradas++;
            return true;
        }
        return false;
    }

    public boolean removerCarro(String placa) {
        for (Carro carro : vagas) {
            if (carro.getPlaca().equals(placa)) {
                vagas.remove(carro);
                vagasDisponiveis++;
                totalSaidas++;
                return true;
            }
        }
        return false;
    }

    public List<Carro> listarCarros() {
        return new ArrayList<>(vagas);
    }

    public int getTotalEntradas() {
        return totalEntradas;
    }

    public int getTotalSaidas() {
        return totalSaidas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public double calcularValor() {
        return totalSaidas * 5.0;
    }
}
