import java.util.List;

public class Desafio1 {

  private List<Integer> numeros;

  public Desafio1(List<Integer> numeros) {
    this.numeros = numeros;

  }

  public List<Integer> ordenacaoNumerica() {
    return numeros.stream()
      .sorted()
      .toList();
  }
}
