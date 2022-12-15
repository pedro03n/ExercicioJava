package lista_de_exercicio;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int media1 = (9 + 8 + 7) /3;
		int media2 = (6 + 5 + 4)/3;
		
		int mediaTotal = media1 + media2;
		
		System.out.println("A soma das duas media é: "+mediaTotal);
		
		sc.close();

	}

}
