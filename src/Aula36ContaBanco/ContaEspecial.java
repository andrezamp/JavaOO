package Aula36ContaBanco;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	@Override
	public String toString() {
		return  super.toString() + " Conta Especial " + " Limite = " + limite;
	}

	@Override
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldoConta() + limite;
		
		if ((saldoComLimite - valor) >= 0) {
			this.setSaldoConta(this.getSaldoConta()-valor);
			System.out.println("Saque efetuado com sucesso! Saldo: R$" + getSaldoConta());
			return true;
		} else {
			System.out.println("Saldo Insuficiente para realizar o saque! Saldo + Limite: R$" + getSaldoConta());
			return false;
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
	
//	public boolean sacar(double valor) {
//		double saldoComLimite = this.getSaldoConta() + limite;
//
//		if ((saldoComLimite - valor) >= 0) {
//			this.setSaldoConta(this.getSaldoConta()-valor);
//			return true;
//		}
//		return false;
//	}


