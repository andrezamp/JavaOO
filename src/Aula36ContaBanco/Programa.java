package Aula36ContaBanco;

public class Programa {
	public static void main(String[] args) {
		System.out.println("********* CONTA BANCÁRIA *********");

		ContaBancaria andrezaContaSimples = new ContaBancaria();
		andrezaContaSimples.setNomeCliente("Andreza");
		andrezaContaSimples.setNumConta("254694");

		andrezaContaSimples.depositar(300);

		andrezaContaSimples.sacar(150);
		andrezaContaSimples.sacar(70);

		System.out.println(andrezaContaSimples);
		System.out.println();
		System.out.println();

		System.out.println("********* CONTA BANCÁRIA POUPANÇA *********");

		ContaPoupanca andrezaPP = new ContaPoupanca();
		andrezaPP.setNomeCliente("Andreza");
		andrezaPP.setNumConta("987456");
		andrezaPP.setDiaRendimento(9);
		andrezaPP.depositar(150);
		andrezaPP.sacar(25);

		if (andrezaPP.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado. Saldo atual R$ " + andrezaPP.getSaldoConta());
		} else {
			System.out.println(
					"Ops! Hoje não é dia de aplicar o rendimento. Saldo atual R$ " + andrezaPP.getSaldoConta());
		}
		System.out.println(andrezaPP);
		System.out.println();
		System.out.println();


		
		System.out.println("********* CONTA BANCÁRIA ESPECIAL *********");

		ContaEspecial andrezaCE = new ContaEspecial();
		andrezaCE.setNomeCliente("Andreza");
		andrezaCE.setNumConta("74108520");
		andrezaCE.setLimite(100);
		andrezaCE.depositar(150);
		andrezaCE.sacar(300);
		andrezaCE.getSaldoConta();

		System.out.println(andrezaCE);
	}

}
