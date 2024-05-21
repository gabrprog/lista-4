
package br.edu.up.controlador;

import br.edu.up.modelos.Passageiro;
import br.edu.up.visao.*;

public class PassageiroControlador {
    private PassageiroVisao passageiroVisao;

    public PassageiroControlador() {
        this.passageiroVisao = new PassageiroVisao();
    }

    public void exibirDetalhesPassageiro(Passageiro passageiro) {
        passageiroVisao.exibirDetalhesPassageiro(passageiro.getNome(), passageiro.getRg(),
                passageiro.getIdentificadorBagagem());
    }
}
