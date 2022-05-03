package VetoresMatrizes;

import java.util.Scanner;

public class RevisaoMatriz {

	public static void main(String[] args) {

		
		int [] [] matriz = new int [2] [7];
		System.out.println(matriz[0][5]);
		System.out.println(matriz.length); //VERIFICADOR DE LINHAS 
		System.out.println(matriz[0].length); //VERIFICADOR DE COLUNAS
		
		matriz[1][4] = 5;
		System.out.println(matriz[1][4]);
		
		matriz[1][2] = 7; //ATRIBUIR VALOR
		matriz[0][3] = 13; //ATRIBUIR VALOR
		
		System.out.print("--------------");
		
		int linha = 0;
		
		for (int i = 0; i < matriz[0].length;i++) {
			System.out.printf("Lin: %d -- Col: %d -- Valor: %d \n", linha,i,matriz[linha][1]);
			
	

			
			
		}
		
		
		
	
	}

}
