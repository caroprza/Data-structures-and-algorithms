public class Main {
  public static void main(String[] args) {
    Employee carolinaPerez = new Employee("Carolina", "Perez", 1234);
    Employee jonathanChavez = new Employee("Jonathan", "Chavez", 5678);
    Employee celesteCeron = new Employee("Celeste", "Ceron", 2323);
    Employee oscarAlvarado = new Employee("Oscar", "Alvarado", 5555);

    EmployeeLinkedList list = new EmployeeLinkedList();
    list.addToFront(carolinaPerez);
    list.addToFront(jonathanChavez);
    list.addToFront(celesteCeron);
    list.addToFront(oscarAlvarado);

    list.printList();

    Employee luciaJimenez = new Employee("Lucia", "Jimenez", 8349);
    list.addToEnd(luciaJimenez);
    System.out.println("--");
    list.removeFromEnd();
    list.removeFromEnd();
    list.printList();
    System.out.println(list.getSize());
  }
}
