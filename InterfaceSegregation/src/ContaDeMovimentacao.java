
public interface ContaDeMovimentacao extends Contas {

	public void realizarPIX(int pvalor);
	public void debitarValorCredito(int pvalor);
	public void solicitarTalaoCheque();
	public void solicitarEmprestimo(int pvalor);
	
}
