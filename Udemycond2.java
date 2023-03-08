package curso_programacao;

import java.util.Scanner;

public class Udemycond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Informe um número inteiro");
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("O número informado é par");
		} else
			System.out.println("O número informado é ímpar");

		sc.close();
	}

}
