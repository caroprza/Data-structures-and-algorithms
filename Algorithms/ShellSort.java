public class ShellSort {
  public static void main(String[] args) {
    int[] lista = {20, 35, -15, 7, 55, 1, -22};

    for (int gap = lista.length / 2; gap > 0; gap /= 2) {

      for (int i = gap; i < lista.length; i++) {
        int newElement = lista[i];
        int j = i;

        while (j >= gap && lista[j - gap] > newElement) {
          lista[j] = lista[j - gap];
          j -= gap;
        }
        lista[j] = newElement;
      }
    }
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }
}
