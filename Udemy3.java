package curso_programacao;

import java.util.Scanner;

public class Udemy3 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, subtotal;
		
		System.out.println("Informe o valor de A");
		a = sc.nextInt();
		
		System.out.println("Informe o valor de B");
		b = sc.nextInt();
		
		System.out.println("Informe o valor de C");
		c = sc.nextInt();
		
		System.out.println("Informe o valor de D");
		d = sc.nextInt();
		
		subtotal = ((a * b) - (c * d));
		
		System.out.println("O valor da diferença foi de" + subtotal);
		
		
		
		
		
		
		
		sc.close();
	}

}
