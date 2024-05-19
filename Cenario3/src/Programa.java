package br.edu.up;

import br.edu.up.modelos.Estacionamento;
import br.edu.up.controller.EstacionamentoControle;
import br.edu.up.vision.Menu;

public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionamentoControle controle = new EstacionamentoControle(estacionamento);
        Menu menu = new Menu(controle);

        menu.exibirMenu();
    }
}
