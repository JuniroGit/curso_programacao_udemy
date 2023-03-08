package curso_programacao;

import java.util.Scanner;

public class Udemy6 {

	public static void main(String[] args) {

		//		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		//		mostre: 
		//		a) a área do triângulo retângulo que tem A por base e C por altura. 
		//		b) a área do círculo de raio C. (pi = 3.14159) 
		//		c) a área do trapézio que tem A e B por bases e C por altura. 
		//		d) a área do quadrado que tem lado B. 
		//		e) a área do retângulo que tem lados A e B. 
		
		Scanner sc = new Scanner(System.in);

		double a, b, c, tri, cir, tra, qua, ret, pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		tri = (a * c) / 2;
		cir = pi * c;
		tra = (a + b) * c / 2;
		qua = b * b;
		ret = a * b;

		System.out.printf("O valor da área do triângulo é de = " + "%.3f%n", tri);
		System.out.printf("O valor da área do círculo é de = " + "%.3f%n", cir);
		System.out.printf("O valor da área do trapézio é de = " + "%.3f%n", tra);
		System.out.printf("O valor da área do quadrado é de = " + "%.3f%n", qua);
		System.out.printf("O valor da área do retângulo é de = " + "%.3f%n", ret);

		sc.close();
	}

}
