import java.util.ArrayList;
import java.util.List;

import Automovel.Estoque;
import Automovel.Veiculo;
import Pessoa.Cliente;

public class LojaAutopecas {

    private Estoque estoque;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<Veiculo> veiculos;
    private List<Venda> vendas;
    private List<Compatibilidade> compatibilidades;

    public LojaAutopecas() {
        estoque = new Estoque();
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
        veiculos = new ArrayList<>();
        vendas = new ArrayList<>();
        compatibilidades = new ArrayList<>();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public List<Compatibilidade> getCompatibilidades() {
        return compatibilidades;
    }
}