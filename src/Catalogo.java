import java.util.ArrayList;
import java.util.List;

import Automovel.Peca;
import Automovel.Veiculo;

public class Catalogo {
    private List<Peca> pecas;
    private List<Compatibilidade> compatibilidades;

    public Peca buscarPecaPorNome(String nome) {
    for (Peca peca : pecas) {
        if (peca.getNome().equalsIgnoreCase(nome)) {
            return peca;
        }
    }

    return null;
}

public List<Peca> buscarPecasPorVeiculo(Veiculo veiculo) {
    List<Peca> resultado = new ArrayList<>();

    for (Compatibilidade compatibilidade : compatibilidades) {
        if (compatibilidade.getVeiculo().equals(veiculo)) {
            resultado.add(compatibilidade.getPeca());
        }
    }

    return resultado;
}
}