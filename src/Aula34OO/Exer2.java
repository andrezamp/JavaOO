package Aula34OO;

public class Exer2 {
	public static void main(String[] args) {
		mostrarResultados(Calculadora.dividir(10, 2));
		mostrarResultados(Calculadora.multiplicar(2, 3));
		mostrarResultados(Calculadora.somar(5, 5));
		mostrarResultados(Calculadora.subtrair(15, 5));
		mostrarResultados(Calculadora.potencia(2, 3));

	}

	static void mostrarResultados(double num) {
		System.out.println(num);
	}
}
