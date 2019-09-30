public class BinarySearch {
  public static int binarySearch(int valor, int[] valores) {
    int min, max, avg;
    min = 0;
    max = valores.length - 1;
    avg = valores.length / 2;

    while(min <= max) {
      //avg = (min+max) / 2;
      //si el valor buscado está en avg regresar la posicion
      //si no revisar si es mayor o menor el valor buscado y actualizar indices
      if (valores[avg] == valor) {
        return avg;
      }
      else if (valor < valores[avg]) {
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
    int[] numeros = {1,3,6,7,9,12,15,20,30,33,66};
    System.out.println(binarySearch(9, numeros));
  }
}
