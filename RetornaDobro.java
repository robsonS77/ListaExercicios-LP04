package listaExerciciosLP04;

import java.util.Scanner;

public class RetornaDobro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;

		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		int res = dobro(numero);
		System.out.println();

		System.out.println("O do dobro de " + numero + " é " + res);

		sc.close();
	}

	public static int dobro(int numero) {
		return numero * 2;
	}
}
