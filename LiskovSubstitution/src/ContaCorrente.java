//Classe principal que controla as classes com os métodos
public class ContaCorrente {

	private DebitoContaCorrente debitoContaCorrente;
	private Debito debito;
	
	//Criando os subsistemas
	public ContaCorrente() {
		debitoContaCorrente = new DebitoContaCorrente();
		debito = new Debito();
	}
	
	public void debitarValorContaCorrente(int valor) {
		debitoContaCorrente.debitarConta(valor);
	}
	
	public void debitarValor(int valor) {
		debito.debitarConta(valor);
	}
		
}
