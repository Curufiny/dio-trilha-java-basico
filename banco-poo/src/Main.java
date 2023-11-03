public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		Rafael.setNome("Rafael");
		
		Conta cc = new ContaCorrente(Rafael);
		Conta poupanca = new ContaPoupanca(Rafael);

		cc.depositar(18000);
        cc.sacar(200);
		cc.transferir(100, poupanca);
        
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
