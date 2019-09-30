public class Fibonacci {
  public static long fibonacci(int n) {
    if (n <= 1) {
      return 1;
    }
    else {
      return fibonacci(n-2) + fibonacci(n-1);
    }
  }

  public static long fibonacciOpt(int n) {
    long[] calculados = new long[n + 1];
    calculados[0] = calculados[1] = 1;
    return fibonacciOpt(n, calculados);
  }

  private static long fibonacciOpt(int n, long[] calculados) {
    if (calculados[n] > 0) {
      return calculados[n];
    }
    else {
      return calculados[n] = fibonacciOpt(n -1, calculados) + fibonacciOpt(n -2, calculados);
    }
  }

  public static void main(String[] args) {

  }
}
