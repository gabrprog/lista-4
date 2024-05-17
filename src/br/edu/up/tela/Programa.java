package br.edu.up.tela;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1598FHK", "Core Java 2", "Cay S. Horstmann e Gary Cornell", "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", "Harvey Deitel", "0130341517", 2015);

        System.out.println("Livro 01:");
        livro1.exibirDados();

        System.out.println("\nLivro 02:");
        livro2.exibirDados();
    }
}
