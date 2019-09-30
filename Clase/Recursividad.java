//Carolina Pérez Alvarado A01631526
public class Recursividad {
  static String resultado = "";

  public static int multiplicacion(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    if (b == 1) {
      return a;
    }
    else {
      return a + multiplicacion(a, b - 1);
    }
  }

  public static int preparacion(int a, int b) {
    if (a >= 0 && b>= 0) {
      return multiplicacion(a,b);
    }
    else if (a < 0 && b < 0) {
      return multiplicacion(a * -1,b * -1);
    }
    else if (a < 0 && b > 0){
      return -1 * multiplicacion(a * -1,b);
    }
    else {
      return -1 * multiplicacion(a,b * -1);
    }
  }

  public static String base10a2(int a) {
    resultado = Integer.toString(a % 2) + resultado;
    if (a/2 == 0) {
      return resultado;
    }
    else {
      return base10a2(a / 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(preparacion(-3,-5));
    System.out.println(base10a2(127));
  }
}
