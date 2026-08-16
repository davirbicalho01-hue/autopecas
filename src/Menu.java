import java.util.List;
import java.util.Scanner;

import Automovel.Peca;
import Automovel.Veiculo;
import Pessoa.Cliente;

public class Menu {

    private Scanner scanner;
    private LojaAutopecas loja;

    public Menu(LojaAutopecas loja) {
        this.scanner = new Scanner(System.in);
        this.loja = loja;

        carregarDadosIniciais();
    }


    // =====================================================
    // DADOS QUE JA EXISTEM QUANDO O PROGRAMA INICIA
    // =====================================================

    private void carregarDadosIniciais() {

        // Evita cadastrar tudo novamente
        if (!loja.getEstoque().getPecas().isEmpty()) {
            return;
        }


        // =====================
        // PECAS
        // =====================

        Peca bateria50 = new Peca(
                "Bateria 50Ah",
                "Bateria automotiva para carros compactos",
                "Moura",
                480.00,
                10
        );

        Peca bateria60 = new Peca(
                "Bateria 60Ah",
                "Bateria automotiva",
                "Moura",
                550.00,
                10
        );

        Peca bateria70 = new Peca(
                "Bateria 70Ah",
                "Bateria automotiva para veiculos de maior porte",
                "Moura",
                650.00,
                8
        );

        Peca bateriaEletrico = new Peca(
                "Bateria Auxiliar 12V",
                "Bateria auxiliar para veiculo eletrico",
                "Bosch",
                650.00,
                6
        );

        Peca pastilha = new Peca(
                "Pastilha de Freio",
                "Pastilha de freio dianteira",
                "TRW",
                180.00,
                15
        );

        Peca vela = new Peca(
                "Vela de Ignicao",
                "Vela para sistema de ignicao",
                "NGK",
                35.00,
                30
        );

        Peca filtro = new Peca(
                "Filtro de Oleo",
                "Filtro para sistema de lubrificacao do motor",
                "Bosch",
                45.00,
                20
        );


        loja.getEstoque().adicionarPeca(bateria50);
        loja.getEstoque().adicionarPeca(bateria60);
        loja.getEstoque().adicionarPeca(bateria70);
        loja.getEstoque().adicionarPeca(bateriaEletrico);
        loja.getEstoque().adicionarPeca(pastilha);
        loja.getEstoque().adicionarPeca(vela);
        loja.getEstoque().adicionarPeca(filtro);


        // =====================
        // FUNCIONARIO
        // =====================

        Funcionario funcionario = new Funcionario(
                "Carlos",
                "11111111111",
                "31999999999",
                "Loja",
                "Vendedor",
                2500.00
        );

        loja.getFuncionarios().add(funcionario);


        // =====================
        // MODELOS DE CARRO
        // =====================

        Veiculo strada = new Veiculo(
                "Strada",
                "Fiat",
                2026,
                "CAT01"
        );

        Veiculo creta = new Veiculo(
                "Creta",
                "Hyundai",
                2026,
                "CAT02"
        );

        Veiculo polo = new Veiculo(
                "Polo",
                "Volkswagen",
                2026,
                "CAT03"
        );

        Veiculo tera = new Veiculo(
                "Tera",
                "Volkswagen",
                2026,
                "CAT04"
        );

        Veiculo toro = new Veiculo(
                "Toro",
                "Fiat",
                2026,
                "CAT05"
        );

        Veiculo tcross = new Veiculo(
                "T-Cross",
                "Volkswagen",
                2026,
                "CAT06"
        );

        Veiculo argo = new Veiculo(
                "Argo",
                "Fiat",
                2026,
                "CAT07"
        );

        Veiculo onix = new Veiculo(
                "Onix",
                "Chevrolet",
                2026,
                "CAT08"
        );

        Veiculo dolphin = new Veiculo(
                "Dolphin",
                "BYD",
                2026,
                "CAT09"
        );

        Veiculo dolphinMini = new Veiculo(
                "Dolphin Mini",
                "BYD",
                2026,
                "CAT10"
        );


        loja.getVeiculos().add(strada);
        loja.getVeiculos().add(creta);
        loja.getVeiculos().add(polo);
        loja.getVeiculos().add(tera);
        loja.getVeiculos().add(toro);
        loja.getVeiculos().add(tcross);
        loja.getVeiculos().add(argo);
        loja.getVeiculos().add(onix);
        loja.getVeiculos().add(dolphin);
        loja.getVeiculos().add(dolphinMini);


        // =====================
        // COMPATIBILIDADES
        // Simplificadas para o trabalho
        // =====================

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria60, strada)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria70, creta)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria50, polo)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria50, tera)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria70, toro)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria60, tcross)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria50, argo)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateria50, onix)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateriaEletrico, dolphin)
        );

        loja.getCompatibilidades().add(
                new Compatibilidade(bateriaEletrico, dolphinMini)
        );
    }


    // =====================================================
    // MENU PRINCIPAL
    // =====================================================

    public void executar() {

        int opcao;

        do {

            System.out.println("\n===== LOJA DE AUTOPECAS =====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Comprar");
            System.out.println("0. Sair");

            opcao = lerInteiro("Escolha: ");

            switch (opcao) {

                case 1:
                    cadastrarCliente();
                    break;

                case 2:
                    menuCompra();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        scanner.close();
    }


    // =====================================================
    // CADASTRAR CLIENTE
    // =====================================================

    private void cadastrarCliente() {

        System.out.println("\n===== CADASTRAR CLIENTE =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        String cpf = lerSomenteNumeros(
                "CPF (somente numeros, sem pontos ou espacos): "
        );

        String telefone = lerSomenteNumeros(
                "Telefone (somente numeros, sem tracos ou espacos): "
        );

        System.out.print("Endereco: ");
        String endereco = scanner.nextLine();

        String dataNascimento = lerDataNascimento();

        System.out.print("Email: ");
        String email = scanner.nextLine();


        Cliente cliente = new Cliente(
                nome,
                cpf,
                telefone,
                endereco,
                dataNascimento,
                email
        );


        loja.getClientes().add(cliente);

        System.out.println("\nCliente cadastrado com sucesso!");
    }


    // =====================================================
    // MENU DE COMPRA
    // =====================================================

    private void menuCompra() {

        int opcao;

        do {

            System.out.println("\n===== COMPRA =====");
            System.out.println("1. Ver Pecas Disponiveis");
            System.out.println("2. Buscar Peca por Nome");
            System.out.println("3. Buscar Peca pelo seu Problema");
            System.out.println("4. Realizar Compra");
            System.out.println("0. Voltar");

            opcao = lerInteiro("Escolha: ");

            switch (opcao) {

                case 1:
                    listarPecas();
                    break;

                case 2:
                    buscarPecaPorNome();
                    break;

                case 3:
                    buscarPorProblema();
                    break;

                case 4:
                    realizarCompra();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }


    // =====================================================
    // LISTAR PECAS
    // =====================================================

    private void listarPecas() {

        System.out.println("\n===== PECAS DISPONIVEIS =====");

        List<Peca> pecas = loja.getEstoque().getPecas();

        for (int i = 0; i < pecas.size(); i++) {

            Peca peca = pecas.get(i);

            System.out.println(
                    (i + 1) + ". " +
                    peca.getNome() +
                    " | " +
                    peca.getMarca() +
                    " | R$ " +
                    peca.getPreco() +
                    " | Estoque: " +
                    peca.getQuantidadeEstoque()
            );
        }
    }


    // =====================================================
    // BUSCAR PECA POR NOME
    // =====================================================

    private void buscarPecaPorNome() {

        System.out.print("\nNome da peca: ");
        String nome = scanner.nextLine();

        for (Peca peca : loja.getEstoque().getPecas()) {

            if (peca.getNome().equalsIgnoreCase(nome)) {

                mostrarPeca(peca);

                return;
            }
        }

        System.out.println("Peca nao encontrada.");
    }


    // =====================================================
    // BUSCAR PECA PELO PROBLEMA
    // =====================================================

    private void buscarPorProblema() {

        int opcao;

        System.out.println("\n===== QUAL PROBLEMA SEU CARRO APRESENTA? =====");

        System.out.println(
                "1. Carro nao liga ou bateria descarrega rapidamente"
        );

        System.out.println(
                "2. Freio fazendo barulho ou carro freando mal"
        );

        System.out.println(
                "3. Motor falhando ou com dificuldade para ligar"
        );

        System.out.println(
                "4. Preciso trocar o oleo ou filtro"
        );

        opcao = lerInteiro("Escolha: ");


        switch (opcao) {

            case 1:
                buscarBateriaPorCarro();
                break;

            case 2:
                buscarPecaPeloNomeParcial("Pastilha");
                break;

            case 3:
                buscarPecaPeloNomeParcial("Vela");
                break;

            case 4:
                buscarPecaPeloNomeParcial("Filtro");
                break;

            default:
                System.out.println("Problema invalido.");
        }
    }


    // =====================================================
    // ESCOLHER CARRO PARA ENCONTRAR BATERIA
    // =====================================================

    private void buscarBateriaPorCarro() {

        List<Veiculo> veiculos =
                loja.getVeiculos();


        System.out.println(
                "\n===== IDENTIFIQUE SEU CARRO ====="
        );


        for (int i = 0; i < veiculos.size(); i++) {

            Veiculo veiculo =
                    veiculos.get(i);

            System.out.print(
                    (i + 1) + ". " +
                    veiculo.getMarca() +
                    " " +
                    veiculo.getModelo()
            );


            if (veiculo.getModelo().equals("Dolphin")
                    || veiculo.getModelo().equals("Dolphin Mini")) {

                System.out.print(" (Eletrico)");
            }

            System.out.println();
        }


        int escolha =
                lerInteiro("Escolha seu carro: ");


        if (escolha < 1 ||
                escolha > veiculos.size()) {

            System.out.println(
                    "Opcao de carro invalida."
            );

            return;
        }


        Veiculo veiculoEscolhido =
                veiculos.get(escolha - 1);


        for (Compatibilidade compatibilidade :
                loja.getCompatibilidades()) {


            if (compatibilidade
                    .getVeiculo()
                    .equals(veiculoEscolhido)) {


                Peca peca =
                        compatibilidade.getPeca();


                if (peca.getNome()
                        .toLowerCase()
                        .contains("bateria")) {


                    System.out.println(
                            "\nBateria indicada para:"
                    );

                    System.out.println(
                            veiculoEscolhido.getMarca() +
                            " " +
                            veiculoEscolhido.getModelo()
                    );


                    mostrarPeca(peca);

                    return;
                }
            }
        }


        System.out.println(
                "Nao encontramos uma bateria compativel."
        );
    }


    // =====================================================
    // BUSCAR PECA POR PARTE DO NOME
    // =====================================================

    private void buscarPecaPeloNomeParcial(
            String nome
    ) {

        boolean encontrou = false;

        System.out.println(
                "\n===== PECA RECOMENDADA ====="
        );


        for (Peca peca :
                loja.getEstoque().getPecas()) {


            if (peca.getNome()
                    .toLowerCase()
                    .contains(nome.toLowerCase())) {


                mostrarPeca(peca);

                encontrou = true;
            }
        }


        if (!encontrou) {

            System.out.println(
                    "Nenhuma peca encontrada."
            );
        }
    }


    // =====================================================
    // MOSTRAR INFORMACOES DA PECA
    // =====================================================

    private void mostrarPeca(Peca peca) {

        System.out.println("\n--- PECA ---");

        System.out.println(
                "Nome: " +
                peca.getNome()
        );

        System.out.println(
                "Marca: " +
                peca.getMarca()
        );

        System.out.println(
                "Descricao: " +
                peca.getDescricao()
        );

        System.out.println(
                "Preco: R$ " +
                peca.getPreco()
        );

        System.out.println(
                "Estoque: " +
                peca.getQuantidadeEstoque()
        );
    }


    // =====================================================
    // REALIZAR COMPRA
    // =====================================================

    private void realizarCompra() {

        if (loja.getClientes().isEmpty()) {

            System.out.println(
                    "\nCadastre um cliente antes de realizar a compra."
            );

            return;
        }


        String cpf =
                lerSomenteNumeros(
                        "CPF do cliente: "
                );


        Cliente cliente = null;


        for (Cliente c :
                loja.getClientes()) {

            if (c.getCpf().equals(cpf)) {

                cliente = c;

                break;
            }
        }


        if (cliente == null) {

            System.out.println(
                    "Cliente nao encontrado."
            );

            return;
        }


        listarPecas();


        List<Peca> pecas =
                loja.getEstoque().getPecas();


        int escolha =
                lerInteiro(
                        "\nEscolha o numero da peca: "
                );


        if (escolha < 1 ||
                escolha > pecas.size()) {

            System.out.println(
                    "Peca invalida."
            );

            return;
        }


        Peca peca =
                pecas.get(escolha - 1);


        int quantidade =
                lerInteiro(
                        "Quantidade: "
                );


        if (quantidade <= 0) {

            System.out.println(
                    "Quantidade invalida."
            );

            return;
        }


        if (quantidade >
                peca.getQuantidadeEstoque()) {

            System.out.println(
                    "Estoque insuficiente."
            );

            return;
        }


        Funcionario funcionario =
                loja.getFuncionarios().get(0);


        Venda venda = new Venda(
                loja.getVendas().size() + 1,
                cliente,
                funcionario
        );


        ItemVenda item =
                new ItemVenda(
                        peca,
                        quantidade,
                        peca.getPreco()
                );


        venda.adicionarItem(item);


        peca.setQuantidadeEstoque(
                peca.getQuantidadeEstoque()
                - quantidade
        );


        loja.getVendas().add(venda);


        System.out.println(
                "\n===== RESUMO DA COMPRA ====="
        );

        System.out.println(
                "Cliente: " +
                cliente.getNome()
        );

        System.out.println(
                quantidade +
                "x " +
                peca.getNome()
        );

        System.out.println(
                "Total: R$ " +
                venda.getValorTotal()
        );


        processarPagamento(
                venda.getValorTotal()
        );
        System.out.println("\nObrigado pela compra!");
        System.out.println("Sistema encerrado.");

        System.exit(0);
    }


    // =====================================================
    // PAGAMENTO
    // =====================================================

    private void processarPagamento(
            double valor
    ) {

        int opcao;

        do {

            System.out.println(
                    "\n===== FORMA DE PAGAMENTO ====="
            );

            System.out.println(
                    "1. Dinheiro"
            );

            System.out.println(
                    "2. Pix"
            );

            System.out.println(
                    "3. Cartao"
            );


            opcao =
                    lerInteiro(
                            "Escolha: "
                    );


            switch (opcao) {

                case 1:

                    System.out.println(
                            "\nPagamento em dinheiro selecionado."
                    );

                    System.out.println(
                            "Valor a pagar: R$ " +
                            valor
                    );

                    System.out.println(
                            "Pagamento realizado com sucesso!"
                    );

                    return;


                case 2:

                    pagamentoPix(valor);

                    return;


                case 3:

                    pagamentoCartao(valor);

                    return;


                default:

                    System.out.println(
                            "Forma de pagamento invalida."
                    );
            }

        } while (true);
    }


    // =====================================================
    // PIX
    // =====================================================

    private void pagamentoPix(
            double valor
    ) {

        System.out.println(
                "\n===== PAGAMENTO VIA PIX ====="
        );

        System.out.println(
                "Valor: R$ " +
                valor
        );

        System.out.println(
                "Tipo da chave: CPF"
        );

        System.out.println(
                "Chave Pix: 11993874607"
        );

        System.out.println(
                "\nRealize o Pix e pressione ENTER para confirmar."
        );

        scanner.nextLine();

        System.out.println(
                "Pagamento confirmado!"
        );
    }


    // =====================================================
    // CARTAO
    // =====================================================

    private void pagamentoCartao(
            double valor
    ) {

        int tipoCartao;


        do {

            System.out.println(
                    "\n===== CARTAO ====="
            );

            System.out.println(
                    "1. Credito"
            );

            System.out.println(
                    "2. Debito"
            );


            tipoCartao =
                    lerInteiro(
                            "Escolha: "
                    );


            if (tipoCartao != 1 &&
                    tipoCartao != 2) {

                System.out.println(
                        "Opcao invalida."
                );
            }

        } while (
                tipoCartao != 1 &&
                tipoCartao != 2
        );


        int forma;


        do {

            System.out.println(
                    "\nComo deseja utilizar o cartao?"
            );

            System.out.println(
                    "1. Inserir"
            );

            System.out.println(
                    "2. Aproximar"
            );


            forma =
                    lerInteiro(
                            "Escolha: "
                    );


            if (forma != 1 &&
                    forma != 2) {

                System.out.println(
                        "Opcao invalida."
                );
            }

        } while (
                forma != 1 &&
                forma != 2
        );


        System.out.println(
                "\nValor: R$ " +
                valor
        );


        if (forma == 1) {

            System.out.println(
                    "Insira o cartao na maquina."
            );

            System.out.print(
                    "Digite a senha de confirmacao: "
            );

            // Apenas simulacao.
            // A senha nao e armazenada.
            scanner.nextLine();


        } else {

            System.out.println(
                    "Aproxime o cartao da maquina..."
            );
        }


        if (tipoCartao == 1) {

            System.out.println(
                    "Pagamento no credito aprovado!"
            );

        } else {

            System.out.println(
                    "Pagamento no debito aprovado!"
            );
        }
    }


    // =====================================================
    // LER CPF E TELEFONE
    // =====================================================

    private String lerSomenteNumeros(
            String mensagem
    ) {

        while (true) {

            System.out.print(mensagem);

            String valor =
                    scanner.nextLine();


            if (valor.matches("[0-9]+")) {

                return valor;
            }


            System.out.println(
                    "Digite apenas numeros, sem pontos, tracos ou espacos."
            );
        }
    }


    // =====================================================
    // DATA DE NASCIMENTO
    // =====================================================

    private String lerDataNascimento() {

        while (true) {

            System.out.print(
                    "Data de nascimento (xx/xx/xxxx): "
            );


            String data =
                    scanner.nextLine();


            if (data.matches(
                    "[0-9]{2}/[0-9]{2}/[0-9]{4}"
            )) {

                return data;
            }


            System.out.println(
                    "Formato invalido. Exemplo: 15/08/2006"
            );
        }
    }


    // =====================================================
    // LER NUMERO INTEIRO
    // =====================================================

    private int lerInteiro(
            String mensagem
    ) {

        while (true) {

            try {

                System.out.print(
                        mensagem
                );


                return Integer.parseInt(
                        scanner.nextLine()
                );


            } catch (
                    NumberFormatException erro
            ) {

                System.out.println(
                        "Digite apenas numeros."
                );
            }
        }
    }
}

