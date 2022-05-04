package logica.aulas.aula10;

import java.util.Scanner;

public class Exercicios {
//EXERCICIO 1
	static void erro () {
		
		System.out.println("Essa é uma mensagem padronizada de erro. Cuidado com o que está");
	}
//EXERCICIO 2
	static String votacao(int idade) {
	
	if ((idade >= 16 && idade < 18)||(idade >=70)){
		return "Voto Opcional";
	} else if (idade >= 18 && idade <70){
		return "Voto Obrigatorio";
	} else {
		return "Voce não pode votar";
		}
	}
	
	public static void main(String[] args) {

		System.out.println("------------------EXERCICIO 1----------");
		erro();
		
		System.out.println("----------");
		
		System.out.println("--------------EXERCICIO 2---------------");
		
		
		System.out.println(votacao(18));
		
		System.out.println("--------------------");
		 
				 
		
		
		
	}

}
