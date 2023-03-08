package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Udemy5 {

	public static void main(String[] args) {
		//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int cod1, cod2, numP1, numP2;
		double valorP1, valorP2, total;
		
		System.out.println("Informe o código do primeiro produto ");
		cod1 = sc.nextInt();
		System.out.println("Informe a quantidade do primeiro produto ");
		numP1 = sc.nextInt();
		System.out.println("Informe o valor unitário do primeiro produto ");
		valorP1 = sc.nextDouble();
		
		System.out.println("Informe o código do segundo produto ");
		cod2 = sc.nextInt();
		System.out.println("Informe a quantidade do segundo produto ");
		numP2 = sc.nextInt();
		System.out.println("Informe o valor unitário do segundo produto ");
		valorP2 = sc.nextDouble();
		
		total = (numP1 * valorP1) + (numP2 * valorP2);
		
		System.out.printf("O valor total a pagar é de U$ = " + "%.2f%n", total);
		
		sc.close();

	}

}
