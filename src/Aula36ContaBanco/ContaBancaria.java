package Aula36ContaBanco;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldoConta;

	@Override
	public String toString() {
		String s = "Conta Bancária ";
		s += "Nome Cliente: " + nomeCliente;
		s += " | Número Conta: " + numConta;
		s += " | Saldo Conta: " + saldoConta;
		return s;
	}

	public void depositar(double valor) {
		saldoConta += valor;
	}

	public boolean sacar(double valor) {
		if ((saldoConta - valor) > 0 == true) {
			saldoConta -= valor;
			System.out.println("Saque efetuado com sucesso! Saldo: R$" + getSaldoConta());
		} else {
			System.out.println("Saldo Insuficiente para realizar o saque! Saldo: R$" + getSaldoConta());
		} return false;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
}
