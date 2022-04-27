package tokiojavaexercicios;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		//.........
		//CAMBALHOTA
		//.........
	/*	
		int cc= 0;
		 
		do {
			System.out.println("Cambalhota "+ cc);
			cc++;
		} while (cc < 3 );

		//.........
		ACERTE O NUMERO (7) PARA SAIR
		//.........
		*/
		Scanner teclado = new Scanner(System.in);
		 int numero; 
		 
		 do {
	
			 System.out.print("Acerte o numero para sair: ");
			 numero = teclado.nextInt();
			 
			 System.out.println("Numero escolhido: " + numero);
			 System.out.println("");
		 } while (numero != 7);
		 
		 System.out.println("Saiu do progama");
		 
	}

}
