import java.util.List;

public class Desafio4 {

  private List<Integer> numeros;

  public Desafio4(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> retiraNumerosImpares() {
    return numeros.stream().filter(n -> n % 2 == 0).toList();
  }

}
