package curso_programacao;

import java.util.Scanner;

public class Udemycond5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cod, quant;
		double total;

		System.out.println("Informe de 1 a 5 qual o pedido você quer");
		cod = sc.nextInt();
		System.out.println("Quantos pedidos serão?");
		quant = sc.nextInt();

		if (cod == 1) {
			total = quant * 4.0;
		} else if (cod == 2) {
			total = quant * 4.5;
		} else if (cod == 3) {
			total = quant * 5.0;
		} else if (cod == 4) {
			total = quant * 2.0;
		} else
			total = quant * 1.5;

		System.out.printf("O valor total do pedido foi de R$ " + "%.2f%n", total);

		sc.close();
	}

}
