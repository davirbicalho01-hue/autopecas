package Pessoa;
import java.util.Scanner;

public class CadastroClientes {
    Cliente cliente = new Cliente(null, null, null, null, null, null);
    Scanner scanner = new Scanner(System.in);
    

    public void CadastrarCliente(Cliente cliente){
        
        System.out.println("Por gentileza digite as informacoes a seguir para que seu cadastro seja realizado");
        
        System.out.println("NOME:");
        cliente.setNome(scanner.nextLine());
        System.out.println("CPF:");
        cliente.setCpf(scanner.nextLine());
        System.out.println("TELEFONE");
        cliente.setTelefone(scanner.nextLine());
        System.out.println("ENDERECO:");
        cliente.setEndereco(scanner.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        cliente.setDataNascimento(scanner.nextLine());
        System.out.println("EMAIL:");
        cliente.setEmail(scanner.nextLine());
        
    }
}
