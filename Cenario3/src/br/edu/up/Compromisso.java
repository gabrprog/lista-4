package br.edu.up;

public class Compromisso {
    private String pessoa;
    private String local;
    private int hora;
    private int dia;
    private int mes;

    // Construtor
    public Compromisso(String pessoa, String local, int hora, int dia, int mes) {
        this.pessoa = pessoa;
        this.local = local;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
    }

    // Getters e Setters
    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // Método para exibir o compromisso
    public void exibirCompromisso() {
        System.out.println("Compromisso com " + pessoa + " às " + hora + "h, dia " + dia + " de " + obterNomeMes(mes) + " no(a) " + local);
    }

    // Método privado para obter o nome do mês
    private String obterNomeMes(int mes) {
        switch (mes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }
}
