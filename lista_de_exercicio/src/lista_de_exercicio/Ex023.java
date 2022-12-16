package lista_de_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdNumero = 0;
		int qtdNumero2 = 0;
		int qtdNumero3 = 0;
		int qtdNumeroNegativos = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Informe o " + i + "º número: ");
			int numero = sc.nextInt();

			if (numero >= 0 && numero <= 100) {
				qtdNumero += 1;
			} else if (numero >= 101 && numero <= 200) {
				qtdNumero2 += 1;
			} else if (numero > 200) {
				qtdNumero3 += 1;
			} else {
				qtdNumeroNegativos += 1;
			}
		}

		System.out.println("\nNúmeros digitados que estão entre 0 e 100: " + qtdNumero);
		System.out.println("Números digitados que estão entre 101 e 200: " + qtdNumero2);
		System.out.println("Números digitados que são maior que 200: " + qtdNumero3);
		System.out.println("Números digitados que são negativos: " + qtdNumeroNegativos);

		sc.close();

	}

}
