import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Desafio1 desafio1 = new Desafio1(numeros);
        System.out.println(desafio1.ordenacaoNumerica());

        Desafio2 desafio2 = new Desafio2(numeros);
        System.out.println(desafio2.somaNumerosPares());

        Desafio3 desafio3 = new Desafio3(numeros);
        System.out.println(desafio3.verificaNumerosPositivos());

        Desafio4 desafio4 = new Desafio4(numeros);
        System.out.println(desafio4.retiraNumerosImpares());

        Desafio5 desafio5 = new Desafio5(numeros);
        System.out.println("Média de números maiores do que 5: " + desafio5.calculaMediaMaioresQueCinco());

        Desafio6 desafio6 = new Desafio6(numeros);
        System.out.println("Números maiores do que 10: " + desafio6.verificaMaiorQueDez());

        Desafio7 desafio7 = new Desafio7(numeros);
        System.out.println("Segundo maior número: " + desafio7.segundoMaior());

        Desafio8 desafio8 = new Desafio8(numeros);
        System.out.println("Soma dos dígitos da lista: " + desafio8.somaDosDigitosDaLista());
    }
}
