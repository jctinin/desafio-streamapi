import java.util.List;

public class Desafio3 {

  private List<Integer> numeros;

  public Desafio3(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public Boolean verificaNumerosPositivos() {
    Boolean resultado = numeros.stream().allMatch(num -> num > 0);

    if (!resultado) {
      System.out.println("A lista contém números negativos.");
    } else {
      System.out.println("A lista contém apenas números positivos.");

    }
    return resultado;
  }

}
