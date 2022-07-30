
//Classe principal que controla as classes com os métodos
public class ContaCorrente {

	private ComprovanteContaCorrente comprovante;
	private DebitoContaCorrente debito;
	private SaldoContaCorrente saldo;
	
	//Criando os subsistemas
	public ContaCorrente() {
		comprovante = new ComprovanteContaCorrente();
		debito = new DebitoContaCorrente();
		saldo = new SaldoContaCorrente();
	}
	
	public void emitirComprovante() {
		comprovante.emitirComprovante();
	}
	
	public void debitarValor(int valor) {
		debito.debitarConta(valor);
	}
	
	public void validarSaldo(int valor) {
		saldo.validarSaldo(valor);
	}
	
}
