public class SelectionSort {
  public static void main(String[] args) {
    int[] lista = {20, 35, -15, 7, 55, 1, -22};
    for (int index = (lista.length-1); index > 0; index--) {
      int largest = 0;
      for (int i = 1; i <= index; i++) {
        if(lista[i] > lista[largest]) {
          largest = i;
        }
      }
      swap(lista, largest, index);
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
