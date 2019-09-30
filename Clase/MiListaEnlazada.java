//Carolina Pérez Alvarado A01631526
import java.util.NoSuchElementException;

public class MiListaEnlazada<E> {
  private NodoLE<E> first,
                    last;
  private int size;

  public MiListaEnlazada() {
    this.first = this.last = null;
    this.size = 0;
    //también super();
  }

  //pasar de un array a linkedList
  public MiListaEnlazada(E[] datos) {
    for (int i = datos.length - 1; i >= 0; i--) {
      this.insertAtFirst(datos[i]);
    }
  }

  public E First() throws NoSuchElementException{
    try {
      return this.first.dato;
    //tambine this.first.getDato();
    }
    catch(NullPointerException e) {
      throw new NoSuchElementException("No se puede obtener el dato");
    }
  }

  public E Last() throws NoSuchElementException{
    try {
      return this.last.dato;
    }
    catch(NullPointerException e) {
      throw new NoSuchElementException("No se puede obtener el dato");
    }
  }

  public int Size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.first == null;
  }

  public void insertAtFirst(E dato) {
    this.first = new NodoLE<>(dato, this.first);
    if (isEmpty()) {
      this.last = this.first;
      System.out.println(this.last);
    }
    this.size++;
  }

  public void insertAtLast(E dato) {
    NodoLE<E> nodo = new NodoLE<>(dato);
    if (isEmpty()) {
      this.first = this.last = nodo;
    }
    NodoLE<E> current = this.first;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(nodo);
    this.last = nodo;
    this.size++;
  }

  public void insertAt(E dato, int pos) throws IndexOutOfBoundsException{
    try {
      NodoLE<E> current = this.first;
      for (int i = 0; i <= pos; i++) {
        current = current.getNext();
        if (i == pos-2) {
          NodoLE<E> nodo = new NodoLE<>(dato, current.getNext());
          current.setNext(nodo);
        }
      }
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("No se puede añadir");
    }
  }

  public E removerFirst() {
    try {
      E dato = this.first;
      this.first = this.first.next;
      this.size--;
      if(this.size == 0) {
        this.last = null;
      }
      return dato;
    }
    catch(NullPointerException e) {
      throw new NoSuchElementException("No se puede borrar el dato");
    }
  }

  public E removeLast() {
    if(this.size <= 1) {
      return removerFirst();
    }
    else {
      NodoLE<E> current = this.first;
      E dato = this.last();
      while (current.getNext() != this.last) {
        current = current.getNext();
      }
      current.setNext(null);
      this.last = current;
      this.size--;
      return dato;
    }
  }

  public E removeAt(int pos) {
    if (this.size <= 1) {
      return this.removerFirst();
    }
    else if (pos == this.size - 1) {
      return this.removeLast();
    }
    else {
      NodoLE<E> current = this.first;
      E dato;
      for (int i = 0; i < pos - 1; i++) {
        current = current.getNext();
      }
      dato = current.getNext().getDato();
      current.setNext(current.getNext().getNext());
      this.size--;
      return dato;
    }
  }

  public void setAt(E dato, int pos) throws IndexOutOfBoundsException{
    if (pos < 0 || pos > this.size) {
      throw new IndexOutOfBoundsException("No se puede colocar el valor");
    }
    else {
      NodoLE<E> current = this.first;
      for (int i = 0; i < pos; i++) {
        current = current.getNext();
      }
      current.setDato(dato);
    }
  }

  public void printList() {
    NodoLE<E> current = this.first;;
    System.out.print("HEAD -> ");
    while (current != null) {
      System.out.print(current);
      System.out.print(" -> ");
      current = current.getNext();
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    Integer[] datos = {1,2,3,4,5,6,7};
    MiListaEnlazada lista = new MiListaEnlazada(datos);
    //lista.insertAt(13,3);
    //lista.insertAtLast(8);
    lista.printList();
  }
}

class NodoLE<E> {
  E dato;
  NodoLE<E> next;

  public NodoLE(E dato, NodoLE<E> next) {
    this.dato = dato;
    this.next = next;
  }

  public NodoLE(E dato) {
    this(dato,null);
  }

  public E getDato() {
    return dato;
  }

  public void setDato(E dato) {
    this.dato = dato;
  }

  public NodoLE<E> getNext() {
    return next;
  }

  public void setNext(NodoLE next) {
    this.next = next;
  }

  public String toString() {
    return " " + dato;
  }

}
