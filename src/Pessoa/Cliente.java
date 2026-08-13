package Pessoa;

public class Cliente extends Pessoa {

    private String dataNascimento;
    private String email;

    public Cliente(String nome, String cpf, String telefone, String endereco, String dataNascimento, String email) {
        super(nome, cpf, telefone, endereco);
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}