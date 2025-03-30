import java.util.List;

public class Desafio2 {

  private List<Integer> numeros;

  public Desafio2(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public Integer somaNumerosPares() {

    Integer somaPar = numeros.stream().reduce(0, (soma, numero) -> {
      if (numero % 2 == 0) {
        return soma + numero;
      } else {
        return soma;
      }
    });

    return somaPar;

  }
}
