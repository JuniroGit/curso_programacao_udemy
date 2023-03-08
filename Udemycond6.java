package curso_programacao;

import java.util.Scanner;

public class Udemycond6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe qualquer valor ");
		double valor = sc.nextDouble();

		if (valor < 0 || valor > 100) {
			System.out.println("O número informado está fora do intervalo");
		} else if (valor >= 0 && valor <= 25) {
			System.out.println("O valor informado está no intervalo de [0,25]");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("O valor informado está no intervalo de [25,50]");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("O valor informado está no intervalo de [50,75]");
		} else if (valor > 75 && valor <= 100)
			System.out.println("O valor informado está no intervalo de [75,100]");

		sc.close();

	}

}
