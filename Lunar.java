import java.util.Scanner;

public class Lunar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt(), m = ler.nextInt();

		for (int k = 1; n != 0 || m != 0; k++) {
			
			if (m == 0) {
				System.out.println("Teste " + k);
				System.out.println(0 + " " + 0);
				continue;
			}
			
			int[] temperaturas = new int[n];
			int soma = 0,  mediaMaior = -200, mediaMenor = 200;

			for (int i = 0; i < n; i++) {
				temperaturas[i] = ler.nextInt();
			}

			for (int i = 0; i + m <= n; i++) {
				for (int j = 0; j < m && i + j < n; j++) {
					soma += temperaturas[i + j];
				}
				int media = soma / m;
				if (mediaMaior < media) {
					mediaMaior = media;
				}
				if (mediaMenor > media) {
					mediaMenor = media;
				}
				soma = 0;
			}
			System.out.println("Teste " + k);

			System.out.println(mediaMenor + " " + mediaMaior);
			System.out.println();

			n = ler.nextInt();
			m = ler.nextInt();
		}
		
		ler.close();
		
	}

}