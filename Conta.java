import java.util.Arrays;
import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int v = ler.nextInt();
		
		while(v != 0) {

		int conta[] = new int[3];
		conta[0] = ler.nextInt();
		conta[1] = ler.nextInt();
		conta[2] = ler.nextInt();

		Arrays.sort(conta);

		int soma = 0, conseguePagar = 0;

		for (int i = 0; i < conta.length; i++) {
			soma += conta[i];
			if (v >= soma) {
				conseguePagar = i + 1;
			} else {
				break;
			}
		}

		System.out.println(conseguePagar);
		
		v = ler.nextInt();
		
		}
		
		ler.close();

	}

}