package Aula34OO;

import java.util.Scanner;

public class Exer3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num;
	
	do {
		System.out.println("Entre com um número positivo ");
		num = scan.nextInt();
		
		if (num <0) {
			System.out.println("Numero Invalido");
		}
	}while (num < 0);
	
	
}
}
