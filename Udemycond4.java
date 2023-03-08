package curso_programacao;

import java.util.Scanner;

public class Udemycond4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int horaI, horaF, duracao;

		System.out.println("Que horas começou o jogo?");
		horaI = sc.nextInt();

		System.out.println("Que horas acabou o jogo?");
		horaF = sc.nextInt();

		if (horaI < horaF) {
			duracao = horaF - horaI;
		} else {
			duracao = 24 - horaI + horaF;
		}
		System.out.println("O jogo durou " + duracao + " horas");

		sc.close();
	}

}
