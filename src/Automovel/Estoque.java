package Automovel;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Peca> pecas;

    public Estoque() {
        pecas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void removerPeca(Peca peca) {
        pecas.remove(peca);
    }

    public List<Peca> getPecas() {
        return pecas;
    }
}
