
public interface Contas {
	
	public void emitirExtrato();
	public void realizarSaque(int pvalor);
	public void debitarValorDebito(int pvalor);
	public void realizarTED(int pvalor);
	public void realizarDOC(int pvalor);

}
