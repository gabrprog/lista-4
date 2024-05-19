package br.edu.up.controle;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;

public class EstacionamentoControle {
    private Estacionamento estacionamento;

    public EstacionamentoControle(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public boolean registrarEntrada(String modelo, String placa, String cor) {
        Carro carro = new Carro(modelo, placa, cor);
        return estacionamento.adicionarCarro(carro);
    }

    public boolean registrarSaida(String placa) {
        return estacionamento.removerCarro(placa);
    }

    public void exibirRelatorio() {
        System.out.println("Total de entradas: " + estacionamento.getTotalEntradas());
        System.out.println("Total de saídas: " + estacionamento.getTotalSaidas());
        System.out.println("Valor total arrecadado: R$ " + estacionamento.calcularValor());
    }
}
