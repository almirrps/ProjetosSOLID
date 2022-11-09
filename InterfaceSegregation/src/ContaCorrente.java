
public class ContaCorrente implements ContaDeMovimentacao {

	@Override
	public void emitirExtrato() {
		System.out.println("Emitindo extrato de conta corrente...");		
	}

	@Override
	public void realizarSaque(int pvalor) {
		System.out.println("Realizando saque de conta corrente no valor de " + pvalor);
		
	}

	@Override
	public void debitarValorDebito(int pvalor) {
		System.out.println("Debitando no modo débito em conta corrente o valor de " + pvalor);		
	}

	@Override
	public void realizarTED(int pvalor) {
		System.out.println("Realizando TED em Conta Corrente no valor de " + pvalor);
	}

	@Override
	public void realizarDOC(int pvalor) {
		System.out.println("Realizando DOC em Conta Corrente no valor de " + pvalor);
		
	}

	@Override
	public void realizarPIX(int pvalor) {
		System.out.println("Realizando PIX em Conta Corrente no valor de " + pvalor);
		
	}

	@Override
	public void debitarValorCredito(int pvalor) {
		System.out.println("Debitar no modo crédito em Conta Corrente o valor de " + pvalor);		
	}

	@Override
	public void solicitarTalaoCheque() {
		System.out.println("Solicitando talão de cheques...");
	}

	@Override
	public void solicitarEmprestimo(int pvalor) {
		System.out.println("Solicitando empréstimo no valor de " + pvalor);		
	}

}
