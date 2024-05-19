package br.edu.up.controle;

import br.edu.up.modelos.Evento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoControle {
    private List<Evento> eventos;

    public EventoControle() {
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(String nome, Date data, String local, int lotacaoMaxima, double precoIngresso) {
        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos);
    }

    public Evento buscarEventoPorNome(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                return evento;
            }
        }
        return null;
    }

    public boolean alterarEvento(String nome, Date novaData, String novoLocal, int novaLotacao, double novoPreco) {
        Evento evento = buscarEventoPorNome(nome);
        if (evento != null) {
            evento.setData(novaData);
            evento.setLocal(novoLocal);
            evento.setLotacaoMaxima(novaLotacao);
            evento.setPrecoIngresso(novoPreco);
            return true;
        }
        return false;
    }

    public boolean excluirEvento(String nome) {
        Evento evento = buscarEventoPorNome(nome);
        if (evento != null) {
            eventos.remove(evento);
            return true;
        }
        return false;
    }
}
