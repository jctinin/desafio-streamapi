import java.util.List;

public class Desafio6 {

  private List<Integer> numeros;

  public Desafio6(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> verificaMaiorQueDez() {
    return numeros.stream()
        .filter(n -> n > 10)
        .toList();
  }

}
