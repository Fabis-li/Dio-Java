package entity;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorWeb;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atedendo Ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador web");
    }

    @Override
    public void toca() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
