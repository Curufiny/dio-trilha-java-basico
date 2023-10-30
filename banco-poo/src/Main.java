public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Rafael");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(18000);
        cc.sacar(200);
		cc.transferir(100, poupanca);
        
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}