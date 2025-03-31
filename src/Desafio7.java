import java.util.List;

public class Desafio7 {

  private List<Integer> numeros;

  public Desafio7(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public Integer segundoMaior() {
    return numeros.stream()
        .distinct()
        .sorted()
        .toList()
        .size() - 1;

  }

}
