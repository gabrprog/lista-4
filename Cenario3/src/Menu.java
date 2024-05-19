package br.edu.up.visao;

import br.edu.up.controle.EventoControle;
import br.edu.up.controle.ReservaControle;
import br.edu.up.modelos.Evento;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Menu {
    private EventoControle eventoControle;
    private ReservaControle reservaControle;
    private Scanner scanner;

    public Menu(EventoControle eventoControle, ReservaControle reservaControle) {
        this.eventoControle = eventoControle;
        this.reservaControle = reservaControle;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("1. Incluir evento");
            System.out.println("2. Alterar evento");
            System.out.println("3. Listar eventos");
            System.out.println("4. Excluir evento");
            System.out.println("5. Incluir reserva");
