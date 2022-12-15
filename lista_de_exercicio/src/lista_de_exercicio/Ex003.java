package lista_de_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero");
		int saldoMedio = sc.nextInt();
		int percentual;
		
		if(saldoMedio <=500) {
			System.out.println("Nenhum cr�dito");
		}else if((saldoMedio >= 501) && (saldoMedio <= 1000)) {
			percentual = (30 * 100) / saldoMedio;
			System.out.println(percentual + " Equivale a 30% do valor do saldo m�dio");
		}else if((saldoMedio >= 1001) && (saldoMedio <= 3000)) {
			percentual = (40 * 100) / saldoMedio;
			System.out.println(percentual + " Equivale a 40% do valor do saldo m�dio");
		}else {
			percentual = (50 * 100) / saldoMedio;
			System.out.println(percentual + " Equivale a 50% do valor do saldo m�dio");
		}
		
		sc.close();

	}

}
