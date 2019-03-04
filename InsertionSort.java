public class InsertionSort {
  public static void main(String[] args) {
    int[] lista = {20, 35, -15, 7, 55, 1, -22};
    for (int index = 1; index < lista.length; index++) {
      int newElement = lista[index];
      int i;
      for (i = index; i > 0 && lista[i -1] > newElement; i--) {
        lista[i] = lista[i -1];
      }
      lista[i] = newElement;
    }
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }
}
