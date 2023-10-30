public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double saldoAntigo;
	protected double valorNaoRetirado;
	protected boolean imprimeSaldoTransferencia = true;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}


	@Override
	public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
		} else {
			saldoAntigo = saldo;
			valorNaoRetirado = valor - saldo;
			saldo -= saldo;
		}
     }

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if(valor>1500) {
			imprimeSaldoTransferencia = false;
		} else {
			imprimeSaldoTransferencia = true;
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
        
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Valor indisponivel, foi sacado R$ " + saldoAntigo 
			+ ", não sendo possível sacar a diferença de " + valorNaoRetirado 
			+ ". Seu novo saldo é " + saldo + "."));
		if(imprimeSaldoTransferencia == false) {
			System.out.println(String.format("Não foi possível efetuar a sua transferência, pois seu limite de valor não pode ser superior a R$ 1.500,00."));
		} else if((int) saldo == 0) {
			System.out.println(String.format("Não foi possível efetuar a sua transferência, pois o valor do seu saldo é R$ 0,00."));
		} else {
			System.out.println(String.format("Sua transferência foi efetuada com sucesso!"));	
		}
	}
}