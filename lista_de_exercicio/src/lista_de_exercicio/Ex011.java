package lista_de_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		String nome = sc.next();
		
		System.out.println("Informe seu salario: ");
		double salario = sc.nextDouble();
		
		System.out.println("Informe o n?mero de vendas em dinheiro: ");
		double vendas = sc.nextDouble();
		
		double comissao = vendas * 0.15;
		double salarioFinal = salario + comissao;
		
		
		System.out.println("O vendedor "+nome);
		System.out.printf("Tem um salario de %.2f",salario);
		System.out.printf(" E nesse m?s teve uma bonifica??o de %.2f",salarioFinal);
		
		sc.close();
	}

}
