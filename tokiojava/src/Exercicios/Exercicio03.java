package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		System.out.println("....EXERCICIO 3.....");
		
		Scanner num = new Scanner(System.in); 
		System.out.print("Digite um numero: ");
		int n = num.nextInt();
		int cont = 1;
			 while (cont <= n) {
			System.out.println(cont);
			cont++;	 
		}
			 System.out.println("ISSO E TUDO PESSOAL!!!");
	}

}
