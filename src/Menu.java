import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;

        do {
            System.out.println(
                "--- Aperte ---\n" +
                "1. Cadastrar Automovel\n" +
                "2. Cadastrar Cliente\n" +
                "3. Acessar Estoque\n" +
                "4. Buscar Peca\n" +
                "5. Registrar Venda\n" +
                "6. Sair"
            );

            opcao = scanner.nextInt();

        } while (opcao != 6);
    }
}