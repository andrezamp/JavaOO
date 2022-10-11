package Aula34OO;

public class Exer1 {
	static void imprimirValor() {
		System.out.println("Valor total: "+Contador.obterValor());
	}

	public static void main(String[] args) {
		imprimirValor();
		Contador.zerar();
		imprimirValor();

		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
		
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		Contador cont4 = new Contador();
		
		imprimirValor();
	}

}
