package tokiojavaexercicios;

import java.util.Scanner;

public class WhileRepeticao {

	public static void main(String[] args) {
		
		//CAMBALHOTA SEM WHILE
		/*
	 System.out.println("cambalhota"); 
	 System.out.println("cambalhota"); 
	 System.out.println("cambalhota"); 
	 */
	 
		
		
		
	//.........	
	//CAMBALHOTA COM WHILE
	//.........
		
	
	 int cc = 0;
	 while (cc < 10) {
		 cc++;
		 
		 if (cc == 3 || cc == 5) {
			 continue;
		 }
		 
		 if (cc == 7) {
			 break;
		 }
		 	 
		 System.out.println("cambalhota " + cc);
		}
		 
		 System.out.println("Fim");
		
		 
		
		
		

	 
	 
	 
	}
}
