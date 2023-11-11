import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int m = ler.nextInt(), n = ler.nextInt();
		
		while(m != 0 || n != 0) {

		int[][] estoque = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				estoque[i][j] = ler.nextInt();
			}
		}

		int compras = ler.nextInt(), comprasEfetuadas = 0;

		for (int k = 0; k < compras; k++) {
			int i = ler.nextInt() - 1;
			int j = ler.nextInt() - 1;
			if (estoque[i][j] > 0) {
				estoque[i][j]--;
				comprasEfetuadas++;
			}
		}

		System.out.println(comprasEfetuadas);
		
		m = ler.nextInt();
		n = ler.nextInt();
		
		}
		
		ler.close();

	}

}