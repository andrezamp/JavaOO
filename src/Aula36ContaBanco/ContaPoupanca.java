package Aula36ContaBanco;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldoConta(this.getSaldoConta() + (this.getSaldoConta() * taxaRendimento));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Conta Poupanca [ Dia De Rendimento: " + diaRendimento + "]"; 
				
				
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
}