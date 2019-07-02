public class RecursiveInsertionSort {
  public static void main(String[] args) {
    int[] lista = {20, 35, -15, 7, 55, 1, -22};
    insertionSort(lista, lista.length);
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }

  public static void insertionSort(int[] lista, int numItems) {
    if (numItems < 2) {
      return;
    }

    insertionSort(lista, numItems - 1);

    int newElement = lista[numItems - 1];
    int i;
    for (i = numItems - 1; i > 0 && lista[i - 1] > newElement; i--) {
      lista[i] = lista[i - 1];
    }

    lista[i] = newElement;
  }
}
