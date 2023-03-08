package curso_programacao;

import java.util.Scanner;

public class Udemycond3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x, y;

		System.out.println("Informe dois números inteiros em ordem crescente ou decrescente");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("Os números informados são múltiplos");
		} else
			System.out.println("Os números não são múltiplos");

		sc.close();
	}

}
