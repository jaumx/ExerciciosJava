package Exercicios;

import java.util.Scanner;

public class Exercicios01 {

	public static void main(String[] args) {
		
		Scanner tec =  new Scanner(System.in);
		String novamente;
		
		do {
			System.out.println("Ola, mundo");
			System.out.print("Exibir novamente? ");
			novamente = tec.nextLine();
				
		} while (novamente.equals ("sim")); 
			
		
		System.out.println("Fim");

		//ESTRUTURA DE REPETIÇÃO DO WHILE//
		
	}

}
