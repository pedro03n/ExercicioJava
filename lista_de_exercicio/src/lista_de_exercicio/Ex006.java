package lista_de_exercicio;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int numero = sc.nextInt();

		int sucessor = numero + 1;
		int antecessor = numero - 1;

		System.out.println("O sucessor do número " + numero + " é: " + sucessor);
		System.out.println("O antecessor do número " + numero + " é: " + antecessor);
		sc.close();

	}

}
