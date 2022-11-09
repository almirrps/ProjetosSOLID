
public class ContaPoupanca implements Contas {

	@Override
	public void emitirExtrato() {
		System.out.println("Emitindo extrato de conta poupança...");
	}

	@Override
	public void realizarSaque(int pvalor) {
		System.out.println("Realizando saque de conta poupança no valor de " + pvalor);		
	}

	@Override
	public void debitarValorDebito(int pvalor) {
		System.out.println("Debitando no modo débito em conta poupança o valor de " + pvalor);
		
	}

	@Override
	public void realizarTED(int pvalor) {
		System.out.println("Realizando TED em conta poupança no valor de " + pvalor);
		
	}

	@Override
	public void realizarDOC(int pvalor) {
		System.out.println("Realizando DOC em conta poupança no valor de " + pvalor);		
	}

}
