package Aula34OO;

public class Calculadora {
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	public static double potencia(int num1, int num2) {
		return Math.pow(num1, num2);
	}
	// int total=1;
//		for (int i=1; i<=num2; i++) {
//			total *=num1;
//		}
//		
//		return total;

	// fatorial 5! = 5*4*3*2*1 = 120
	public static int fatorial( int num) {
		if (num ==0) {
			return 1;
		}
		int total =1;
		for (int i = num; i>1; i--) {
			total *=num;
		}
		return total;
	}

}
