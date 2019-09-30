//Carolina Perez Alvarado A01631526
public class Ordenamientos {

  public static <E extends Comparable<E>> void bubbleSort(E[] datos) {
    boolean desordenados = true;
    for (int index = datos.length - 1; index > 0 && desordenados; index--) {
      desordenados = false;
      for (int i = 0; i < index; i++) {
        if (datos[i].compareTo(datos[i+1]) > 0) {
          swap(datos,i, i+1);
          desordenados = true;
        }
      }
    }
    imprimeArreglo(datos);
  }

  private static <E> void swap(E[] datos, int i, int j) {
    E temp = datos[i];
    datos[i] = datos[j];
    datos[j] = temp;
  }

  public static <E> void imprimeArreglo(E[] datos) {
    for (E i:datos) {
      System.out.println(i);
    }
  }

  public static <E extends Comparable<E>> void mergesort(E[] datos) {
    mergesort(datos, 0, datos.length);
  }

  public static <E extends Comparable<E>> void mergesort(E[] datos, int ini, int fin) {
    if (fin - ini < 2) {
      return;
    }
    int mid = (ini+fin)/2;
    mergesort(datos,ini,mid);
    mergesort(datos,mid,fin);
    merge(datos, ini, mid, fin);
  }

  private static <E extends Comparable<E>> void merge(E[] datos, int ini, int mid, int fin) {
    if (datos[mid-1].compareTo(datos[mid]) <= 0) {
      return;
    }
    int i = ini;
    int j = mid;
    int tempIndex = 0;
    E[] temp = (E[]) new Comparable[fin-ini];

    while (i < mid && j < fin) {
      if (datos[j].compareTo(datos[i]) <= 0) {
        temp[tempIndex] = datos[j];
        tempIndex++;
        j++;
      }
      else {
        temp[tempIndex] = datos[i];
        tempIndex++;
        i++;
      }
    }
    System.arraycopy(datos, i, datos, ini + tempIndex, mid - i);
    System.arraycopy(temp, 0, datos, ini, tempIndex);
  }

  public static <E extends Comparable<E>> void quicksort(E[] datos) {
    quicksort(datos, 0, datos.length);
  }

  private static <E extends Comparable<E>> void quicksort(E[] datos, int left, int right) {
    if (right - left < 2) {
      return;
    }
    int p = particionar(datos, left, right);
    quicksort(datos, left, p);
    quicksort(datos, p+1, right);
  }

  private static <E extends Comparable<E>> int particionar(E[] datos, int left, int right) {
    E pivote = datos[left];
    int i = left;
    int j = right;

    while (i < j) {
      while (i < j && datos[--j].compareTo(pivote) >= 0);
      if (i < j) {
        datos[i] = datos[j];
      }
      while (i < j && datos[++i].compareTo(pivote) <= 0);
      if (i < j) {
        datos[j] = datos[i];
      }
    }
    datos[j] = pivote;
    return j;
  }

  public static void main(String[] args) {
    Integer[] datos = {2,4,5,72,6,1,676,3,2};
    mergesort(datos);
    imprimeArreglo(datos);
  }
}
