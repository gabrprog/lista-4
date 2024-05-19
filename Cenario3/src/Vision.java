package br.edu.up.vision;

import br.edu.up.controle.EstacionamentoControle;

import java.util.Scanner;

public class Menu {
    private EstacionamentoControle controle;
    private Scanner scanner;

    public Menu(EstacionamentoControle controle) {
        this.controle = controle;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("1. Registrar entrada de veículo");
            System.out.println("2. Registrar saída de veículo");
            System.out.println("3. Exibir relatório");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    registrarEntrada();
                    break;
                case 2:
                    registrarSaida();
                    break;
                case 3:
                    controle.exibirRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void registrarEntrada() {
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();
        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();
        System.out.println("Digite a cor do carro:");
        String cor = scanner.nextLine();

        if (controle.registrarEntrada(modelo, placa, cor)) {
            System.out.println("Carro registrado com sucesso!");
        } else {
            System.out.println("Não há vagas disponíveis.");
        }
    }

    private void registrarSaida() {
        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();

        if (controle.registrarSaida(placa)) {
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Carro não encontrado.");
        }
    }
}
