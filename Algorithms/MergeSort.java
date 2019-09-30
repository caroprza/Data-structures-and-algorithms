public class MergeSort {
  public static void main(String[] args) {
    Integer[] lista = {20, 35, -15, 7, 55, 1, -22};

    mergeSort(lista, 0, lista.length);
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }
  public static <E extends Comparable<E>> void mergeSort(E[] input, int start, int end) {
    if (end - start < 2) {
      return;
    }
    int mid = (start + end) / 2;
    mergeSort(input, start, mid);
    mergeSort(input, mid, end);
    merge(input, start, mid, end);
  }
  public static <E extends Comparable<E>> void merge(E[] input, int start, int mid, int end) {
    if (input[mid -1].compareTo(input[mid]) <= 0) { //Compara el primer elemento del array derecho con el último del izquierdo.
      return;
    }
    int i = start;
    int j = mid;
    int tempIndex = 0;
    E[] temp = (E[]) new Comparable[end - start];
    //new int[end - start];
    while (i < mid && j < end) {
      temp[tempIndex++] = input[i].compareTo(input[j]) <= 0 ? input[i++] : input[j++];
    }
    System.arraycopy(input, i, input, start + tempIndex, mid - i);
    System.arraycopy(temp, 0, input, start, tempIndex);
  }
}
