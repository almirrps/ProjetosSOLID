//Classe principal que controla as classes com os métodos
public class ContaPoupanca {

	private DebitoContaPoupanca debitoContaPoupanca;
	
	//Criando os subsistemas
	public ContaPoupanca() {
		debitoContaPoupanca = new DebitoContaPoupanca();
	}
	
	public void debitarValor(int valor) {
		debitoContaPoupanca.debitarConta(valor);
	}
		
}
