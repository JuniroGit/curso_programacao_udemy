package curso_programacao;

import java.util.Scanner;

public class Udemy1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		Scanner sc = new Scanner(System.in);

		int a, b, soma;
		
		System.out.println("Digite dois valores inteiros para realizar a soma!");
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		System.out.println("A soma dos valores inteiros foi de = " + soma);
		
		sc.close();
		

	}

}
