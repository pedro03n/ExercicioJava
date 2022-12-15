package lista_de_exercicio;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		
		if((idade >= 18) && (idade <= 65)) {
			System.out.println("Eleitor obrigatório");
		}else if((idade >= 16) || (idade > 65)) {
			System.out.println("Eleitor facultativo");
		}else {
			System.out.println("Não eleitor");
		}
		
		sc.close();

	}

}
