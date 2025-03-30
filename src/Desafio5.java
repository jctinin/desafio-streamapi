import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {

  private List<Integer> numeros;

  public Desafio5(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public double calculaMediaMaioresQueCinco() {

    double somaMaioresQueCinco = numeros.stream()
        .filter(n -> n > 5)
        .mapToInt(n -> n)
        .average()
        .orElse(0.0);


    return somaMaioresQueCinco;

  }

}
