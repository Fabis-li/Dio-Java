import entity.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("Reprodutor Musical: ");
        iphone.toca();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("-----------------");

        System.out.println("Aparelho Telefônico: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("-----------------");

        System.out.println("Navegador na Internet: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("-----------------");

    }
}