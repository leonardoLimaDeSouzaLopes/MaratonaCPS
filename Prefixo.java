import java.util.Scanner;

public class Prefixo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();

		while (n != 0) {
			String p = ler.next();
			int m = ler.nextInt();
			String s = ler.next();

			String pChar[] = p.split("");
			String sChar[] = s.split("");

			int ndcdmpqecads = 0, menor = m;
			if (n < m) {
				menor = n;
			}
			for (int i = 0; i < menor;) {
				if (pChar[i].equals(sChar[i])) {
					i++;
					ndcdmpqecads = i;
				} else {
					break;
				}
			}

			System.out.println(ndcdmpqecads);

			n = ler.nextInt();
			
		}
	}

}
