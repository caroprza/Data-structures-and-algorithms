public class BubbleSort {
  public static void main(String[] args) {
    int[] lista = {20, 35, -15, 7, 55, 1, -22};
    for (int index = (lista.length-1); index > 0; index--) {
      for (int i = 0; i < index; i++) {
        if (lista[i] > lista[i+1]) {
          swap(lista, i, i+1);
        }
      }
    }
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }
  public static void swap(int[] array, int i, int j) {
    if (i == j) {
      return;
    }
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
