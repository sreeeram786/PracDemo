package beginjava;

public class NumTriangle {
	public static void trian(int rows) {
		int x, y;
		// row iteration
		for (x = 1; x <= rows; x++) {
			// iteration for printing no.s
			for (y = 0; y < x; y++) {
				System.out.print(x);
				// condition to avoid extra spaces at the end of each row
				if (y <= x - 2) {
					System.out.print(" ");
				}
			}
			// condition to avoid extra row iteration at the end.
			if (x != rows) {
				// enter new line
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {

		trian(5);
	}

}
