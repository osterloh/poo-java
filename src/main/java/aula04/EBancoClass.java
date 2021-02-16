package aula04;

public class EBancoClass {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// Construtor
	public EBancoClass() {
		this.saldo = 0;
		this.status = false;
	}

	// Metodos especiais
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Metodos personalizados
	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}

	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if (tipo.equals("cc")) {
			this.setSaldo(50);

		} else if (tipo.equals("cp")) {
			this.setSaldo(150);

		}

		System.out.println("Conta aberta com sucesso!!!");
	}

	public void fecharConta() {
		if (this.saldo > 0) {
			System.out.println("Ainda possui saldo na conta, favor retirar!!!");

		} else if (this.getSaldo() < 0) {
			System.out.println("Saldo negativo, favor acertar os debitos!!!");

		} else {
			setStatus(false);
			System.out.println("Conta encerrada com sucesso!!!");
		}
	}

	public void depositar(float valor) {
		if (this.isStatus()) {
			// saldo = saldo + valor;
			setSaldo(getSaldo() + valor);
			System.out.println("Deposito realizado com sucesso, na conta " + this.getDono() + "!!!");

		} else {
			System.out.println("Erro ao depositar!!!");

		}
	}

	public void sacar(float valor) {
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono() + " com sucesso!!!");

			} else {
				System.out.println("Saldo insuficiente!!!");

			}

		} else {
			System.out.println("Erro ao sacar!!!");
		}
	}

	public void pagarMensal() {
		float valor = 0;

		if (this.getTipo().equals("cc")) {
			valor = 12;

		} else if (this.getTipo().equals("cp")) {
			valor = 20;

		}

		if (this.isStatus()) {
			if (saldo > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Mensalidade paga por " + this.getDono() + " com sucesso!!!");

			} else {
				System.out.println("Saldo insuficiente!!!");

			}

		} else {
			System.out.println("Erro ao pagar!!!");
		}
	}

}
