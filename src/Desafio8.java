import java.util.List;

public class Desafio8 {

  private List<Integer> numeros;

  public Desafio8(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public Integer somaDosDigitosDaLista(){
    return numeros.stream()
        .mapToInt(Integer::intValue)
        .sum();
  }

}
