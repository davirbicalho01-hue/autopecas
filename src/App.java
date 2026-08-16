public class App {

    public static void main(String[] args) {

        LojaAutopecas loja = new LojaAutopecas();

        Menu menu = new Menu(loja);

        menu.executar();
    }
}
