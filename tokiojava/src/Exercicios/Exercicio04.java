package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		
		System.out.println("--------EXERCICIO 04----------");
		
		Scanner tec = new Scanner(System.in);
		double num1 , num2; 
		
		do {
			System.out.print("Digite sua nota: ");
			num1 = tec.nextDouble();
			
		} while ( num1 < 0 || num1 > 10);
		
		do { 
			System.out.print("DIgite a segunda nota: ");
			num2 = tec.nextDouble();
			
		} while (num2 < 0 || num2 > 10);
		
		double media = (num1 + num2) / 2; 
		System.out.print("Sua media e: " + media);
		
				
				
				
				
		
		
		
		
		
		
	}

}
