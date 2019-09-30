//Carolina Pérez Alvarado A01631526
public class BinarySearchRec {

	public static <E extends Comparable<E>> int binarySearchRec(E[] valores, E valor) {
		int min = 0;
		int max = valores.length - 1;
		return binarySearchRec(valores, valor, min, max);
	}

	private static <E extends Comparable<E>> int binarySearchRec(E[ ] valores,E valor,int min,int max) {
		int avg = (min + max) / 2;
		if (valores[avg].equals(valor)) {
			return avg;
		}
		else if (min > max) {
			return -1;
		}
		else if (valor.compareTo(valores[avg]) < 0) {
			return binarySearchRec(valores, valor, min, avg - 1);
		}
		else {
			return binarySearchRec(valores, valor, avg + 1, max);
		}
	}

	public static void main(String[] args) {
		Integer[] valores = {1,2,5,7,9,11,16,22,30,44,55,99};
		System.out.println(binarySearchRec(valores, 99));
	}
}
