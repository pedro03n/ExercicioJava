package lista_de_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu saldo: ");
		double saldo = sc.nextDouble();
		
		saldo *= 1.5;
		
		System.out.printf("O saldo com reajuste ficou: %.2f",saldo);
		sc.close();
	}

}
