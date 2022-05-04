package aula11;

public class MetodosComRetorno {
	
	
	static int somar (int a, int b){
		return a + b;
	}
		static String saudacao(String nome) {
			String str = "Ola, " + nome + "! Seja bem vindo";
			return str;	
	}
		
		
	
	public static void main(String[] args) {
		
		somar(15, 22);	
		
		
		System.out.println(Math.pow(1, 2));
		
		int retornoSoma = somar(10,20);
		System.out.println("retorno soma: " + retornoSoma);
		
		Math.pow(37, 4);
		
		double retornoPow = Math.pow(4, 2);
		
		System.out.println(retornoPow);	
				
		System.out.println(saudacao("Arthur"));	
		
		
	}

}
