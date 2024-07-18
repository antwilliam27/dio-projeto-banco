
public interface IConta {
	
	  void sacar(double valor);
		
	  void depositar(double valor);
		
	  void tansferir(double valor, IConta contaDestino);
	  
	  void imprimirExtrato();
}
