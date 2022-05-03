package VetoresMatrizes;

import java.util.Scanner;

public class Revisao09 {

	public static void main(String[] args) {

		 double [] notas = new double [5]; //VETOR 
				 
		 System.out.println();
				 
		 notas[3] = 9.5;
		
		 System.out.println(notas);
		 Scanner teclado = new Scanner(System.in);
		 
		 
		 
		 System.out.println(notas[0]);
		 
	
		 
		 int qtdNotas = notas.length;
		 System.out.println(qtdNotas);
		 
		 for (int i = 0; i < qtdNotas; i++) {	//ESTRUTURA FOR 	 
			 System.out.print("Digite a nota: " + i + ": " );
			 notas [i] = teclado.nextDouble();
			 
		 }
			 
			 System.out.println("-------------");
			 
			 for (int i= 0; i < qtdNotas; i++) {	//ESTRUTURA FOR 	 
				 System.out.println("Nota: "  + i + "e igual a: " + notas[i]); 
			}
			 
			 double somaNotas = notas[0] + notas[1]	+ notas[2] + notas[3] + notas [4]; 
			 System.out.println("--------------------");
			 System.out.println("Soma de notas: " + somaNotas);
			 
			 double media = somaNotas / qtdNotas;
			 System.out.println("-----------------");
			 System.out.println("Media total: " + media);
			 
			 
			 
			 
			 
	}
}
