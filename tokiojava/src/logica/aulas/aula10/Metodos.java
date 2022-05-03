package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos { 
	
	static void saudacao () {
		System.out.println("seja bem vindo ao progama!!!");
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = tec.next();
		
		System.out.print("Digite sua idadde: ");
		int idade = tec.nextInt();
		
		if (idade <18) {
			System.out.print("Ola " + nome + " Voce e menor de idade");
		} else {
			System.out.print("Ola " + nome + " Voce e maior de idade");
		}	
		
	}
	
	 	static void saudacaoComArgs(String nome, int idade) {
	 		System.out.println(nome);
	 		System.out.println(idade + " Anos"); 		
	 	}
	
	 	static void somar (int a, int b) {
	 	int soma = a + b;
	 	System.out.println(soma);
	 	}

	public static void main(String[] args) {
		
		
		System.out.println("Ola!!!!!");
		
		
		
	//	saudacao();
		
		saudacaoComArgs("jaumx", 17);
		
		somar(500, 500);
		
	}

}
