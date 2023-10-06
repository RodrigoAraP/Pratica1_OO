package br.com.questao01;



public class Encontrar {
    public static void main(String[] args) {
        Usuario user = new Usuario("Rodrigo", "rodrigo@mail.com","rodrigo");
        AchadoPerdido aP1 = new AchadoPerdido("Camisa vermelha","Camisa vermelha de manga cumprida","Roupa","Perdida");

        System.out.println(aP1.buscarTitulo());
        System.out.println(aP1.visualizarDetalhes());

    }
}
