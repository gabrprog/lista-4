package br.edu.up.controle;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservaControle {
    private List<Reserva> reservas;

    public ReservaControle() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(String responsavel, int quantidadePessoas, Date data, Evento evento) {
        Reserva reserva = new Reserva(responsavel, quantidadePessoas, data, evento);
        reservas.add(reserva);
    }

    public List<Reserva> listarReservas() {
        return new ArrayList<>(reservas);
    }

    public Reserva buscarReservaPorResponsavel(String responsavel) {
        for (Reserva reserva : reservas) {
            if (reserva.getResponsavel().equalsIgnoreCase(responsavel)) {
                return reserva;
            }
        }
        return null;
    }

    public boolean alterarReserva(String responsavel, int novaQuantidadePessoas, Date novaData, Evento evento) {
        Reserva reserva = buscarReservaPorResponsavel(responsavel);
        if (reserva != null) {
            reserva.setQuantidadePessoas(novaQuantidadePessoas);
            reserva.setData(novaData);
            reserva.setValorTotal(novaQuantidadePessoas * evento.getPrecoIngresso());
            return true;
        }
        return false;
    }

    public boolean excluirReserva(String responsavel) {
        Reserva reserva = buscarReservaPorResponsavel(responsavel);
        if (reserva != null) {
            reservas.remove(reserva);
            return true;
        }
        return false;
    }
}
