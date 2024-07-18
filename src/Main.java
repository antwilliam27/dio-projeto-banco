
public class Main {

	public static void main(String[] args) {
		Cliente william = new Cliente();
		william.setNome("William");
		
		Conta cc = new ContaCorrente(william);
		Conta poupaca = new ContaPoupaca(william);
		
		cc.depositar(100);
		cc.tansferir(100, poupaca);
		
		cc.imprimirExtrato();
		poupaca.imprimirExtrato();
	}
}
