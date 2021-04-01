package Atividade_1;

public class Programa {
    public static void main(String[] args) {
        Restaurante meuRestaurante = new Restaurante();
        //meuRestaurante.gerarDadosAleatorios();
        //meuRestaurante.imprimirCozinhas();
        Interface rest = new Interface();
        rest.exibir();
        
        //ManipuladoraArquivos ma = new ManipuladoraArquivos();
        //Manipuladora.gerarArquivoBinario(meuRestaurante.getCozinhas(), "binario");

        //meuRestaurante = null;
        //meuRestaurante = Manipuladora.lerArquivoBinario("binario");
        //meuRestaurante.imprimirCozinhas();

    }
}