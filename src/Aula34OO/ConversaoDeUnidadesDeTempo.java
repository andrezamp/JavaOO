package Aula34OO;

public class ConversaoDeUnidadesDeTempo {
	
	public static double convMinutos(double num) {
		double num1total=0;
		num1total = num * 60;
		System.out.println(num + " minutos tem " + num1total + " segundos");
		return num;
	}

	public static double convHora(double num1) {
		double num1total=0;
		num1total = num1 * 60;
		System.out.println(num1 + " horas tem " + num1total+ " minutos");
		return num1;
	}

	public static double convDia(double num1) {
		double num1total=0;
		num1total = num1 * 24;
		System.out.println(num1 +" dias tem " + num1total + " horas");
		return num1;
	}
	
	public static int convSemana(int num1) {
		int num1total=0;
		num1total = num1 * 7;
		System.out.println(num1 + " semanas tem " + num1total + " dias");
		return num1;
	}

	public static double convMes(double num1) {
		double num1total=0;
		num1total = num1 * 30;
		System.out.println(num1 + " meses tem " + num1total + " dias");
		return num1;
	}

	public static double convAnos(double num1) {
		double num1total=0;
		num1total = num1 * 365.25;
		System.out.println(num1 + " anos possui "+ num1total + " dias");
		return num1;
	}

}
