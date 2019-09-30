public class BinarySearchString {
  public static <E extends Comparable<E>> int binarySearch(E valor, E[] valores) {
    int min, max, avg;
    min = 0;
    max = valores.length - 1;
    avg = valores.length / 2;

    while(min <= max) {
      //avg = (min+max) / 2;
      //si el valor buscado está en avg regresar la posicion
      //si no revisar si es mayor o menor el valor buscado y actualizar indices
      if (valores[avg].equals(valor)) {
        return avg;
      }
      else if (valor.compareTo(valores[avg]) < 0) {
          max = avg - 1;
          avg /= 2;
      }
      else {
          min = avg + 1;
          avg = avg + (avg/2);
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    String[] numeros = {"alba", "carolina", "fernanda", "mauricio", "omar", "zapata"};
    System.out.println(binarySearch("carolina", numeros));
  }
}
