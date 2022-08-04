//Classe principal que controla as classes com os métodos
public class ContaCorrente {

	private ComprovanteContaCorrente comprovante;
	private DebitoContaCorrente debitoContaCorrente;
	private SaldoContaCorrente saldo;
	
	//Criando os subsistemas
	public ContaCorrente() {
		comprovante = new ComprovanteContaCorrente();
		debitoContaCorrente = new DebitoContaCorrente();
		saldo = new SaldoContaCorrente();
	}
	
	public void emitirComprovante(String dataInicio, String dataFim) {
		comprovante.emitirComprovante(dataInicio, dataFim);
	}
	
	public void emitirComprovante() {
		comprovante.emitirComprovante();
	}

	public void debitarValor(int valor) {
		debitoContaCorrente.debitarConta(valor);
	}
	
	public void validarSaldo(int valor) {
		saldo.validarSaldo(valor);
	}
	
}
