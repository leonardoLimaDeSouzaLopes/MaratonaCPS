import java.util.Scanner;

public class Curso {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt(), m = ler.nextInt();
		
		int k;
		String[] diciplinaAvancada = new String[n], diciplinasRequisito;
		
		for (int i = 0; i <n; i++) {
			diciplinaAvancada[i] = ler.next();
			k = ler.nextInt(); 
		}
		ler.close();
	}

}
