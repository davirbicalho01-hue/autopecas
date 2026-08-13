import Automovel.Peca;
import Automovel.Veiculo;

public class Compatibilidade {

    private Peca peca;
    private Veiculo veiculo;

    public Compatibilidade(Peca peca, Veiculo veiculo) {
        this.peca = peca;
        this.veiculo = veiculo;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
