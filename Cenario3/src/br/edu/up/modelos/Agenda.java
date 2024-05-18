package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.Compromisso;

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        this.compromissos.add(compromisso);
    }

    public void removerCompromisso(Compromisso compromisso) {
        this.compromissos.remove(compromisso);
    }

    public void listarCompromissos() {
        if (compromissos.isEmpty()) {
            System.out.println("Não há compromissos na agenda.");
        } else {
            System.out.println("Compromissos na agenda:");
            for (Compromisso c : compromissos) {
                c.exibirCompromisso();
            }
        }
    }
}

