import Pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String telefone, String endereco, String cargo, double salario) {
        super(nome, cpf, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + getNome() + '\'' + ", cpf='" + getCpf() + '\'' + ", telefone='" + getTelefone() + '\'' + ", endereco='" + getEndereco() + '\'' + ", cargo='" + cargo + '\'' + ", salario=" + salario + '}';
    }
}