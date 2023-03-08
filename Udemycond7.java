package curso_programacao;

import java.util.Scanner;

public class Udemycond7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe dois valora com uma casa decimal");
		double valorx = sc.nextDouble();
		double valory = sc.nextDouble();

		if (valorx == 0 && valory == 0) {
			System.out.println("Os valores informados estão no ponto de Origem");
		} else if (valorx == 0) {
			System.out.println("Os valores informados estão no eixo Y");
		} else if (valory == 0) {
			System.out.println("Os valores informados estão no eixo X");
		} else if (valorx > 0 && valory > 0) {
			System.out.println("Os valores informados estão no Quadrante 1");
		} else if (valorx > 0 && valory < 0) {
			System.out.println("Os valores informados estão no Quadrante 4");
		} else if (valorx < 0 && valory < 0) {
			System.out.println("Os valores informados estão no Quadrante 3");
		} else if (valorx < 0 && valory > 0) {
			System.out.println("Os valores informados estão no Quadrante 2");
		}

		sc.close();
	}

}
