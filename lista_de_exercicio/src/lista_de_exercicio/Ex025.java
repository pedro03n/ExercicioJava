package lista_de_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero");
		int numero = sc.nextInt();
		if(numero > 0) {
			for (int i = 1; i >= 0; i++) {
				System.out.print("Insira mais um " + i + "� n�mero: ");
				numero += i;
				System.out.println("A soma �: "+ numero);
			}	
		}else {
			System.out.println("Foi inserido um n�mero negativo");
		}
	}

}
