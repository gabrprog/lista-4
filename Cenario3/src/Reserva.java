package br.edu.up.modelos;

import java.util.Date;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private Date data;
    private double valorTotal;
    private Evento evento;

    public Reserva(String responsavel, int quantidadePessoas, Date data, Evento evento) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.data = data;
        this.valorTotal = quantidadePessoas * evento.getPrecoIngresso();
        this.evento = evento;
    }

 

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Evento getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return "Reserva [responsavel=" + responsavel + ", quantidadePessoas=" + quantidadePessoas + ", data=" + data
                + ", valorTotal=" + valorTotal + ", evento=" + evento.getNome() + "]";
    }
}
