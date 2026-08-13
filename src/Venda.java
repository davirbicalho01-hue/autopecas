import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Pessoa.Cliente;

public class Venda {

    private int id;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDate data;
    private List<ItemVenda> itens;
    private double valorTotal;

    public Venda(int id, Cliente cliente, Funcionario funcionario) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
        calcularValorTotal();
    }

    public void removerItem(ItemVenda item) {
        itens.remove(item);
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        valorTotal = 0;

        for (ItemVenda item : itens) {
            valorTotal += item.calcularSubtotal();
        }
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDate getData() {
        return data;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() +
                ", funcionario=" + funcionario.getNome() +
                ", data=" + data +
                ", valorTotal=" + valorTotal +
                '}';
    }
}