package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Udemy4 {

	public static void main(String[] args) {
		//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//		decimais
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas, numFun;
		double horasTrab, sal;
		
		System.out.println("Informe o número de funcionários");
		numFun = sc.nextInt();
		
		System.out.println("Informe o número de horas de trabalho do funcionário");
		horas = sc.nextInt();
		
		System.out.println("Informe quanto o funcionário recebe por hora");
		horasTrab = sc.nextDouble();
		
		sal = horas * horasTrab;
		
		System.out.println("O número de funcionários é de = " + numFun);
		System.out.printf("Os funcionários recebem" + " U$ %.2f%n", sal);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
