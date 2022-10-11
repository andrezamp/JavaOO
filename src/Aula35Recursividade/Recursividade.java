package Aula35Recursividade;

public class Recursividade {
	public static int fatorialNaoRecursivo( int num) {
		if (num ==0) {
			return 1;
		}
		int total =1;
		for (int i = num; i>1; i--) {
			total *=i;
		}
		return total;
	}
	
//fatorial (5) = 5 * fatorial(4) → 4!
//fatorial (4) = 4 * 3! 
//fatorial (3) = 3 *2!
//fatorial (2) = 2 * 1!
//fatorial (1) = 1 * 0!
//fatorial (0) = 1
	
	public static int fatorial (int num) {
		//precisa de um ponto de parada, o if que se o num for =0 retorna um
		
		if(num ==0) {
			return 1;
		}
		return num * fatorial(num-1);
	}
	
}

