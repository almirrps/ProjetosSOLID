
public class MyApp {

	public static void main(String[] args) {
	
		//Criando o objeto principal
		ContaCorrente contaCorrente = new ContaCorrente();
		
		//Executando os métodos vinculados ao objeto principal
		contaCorrente.emitirComprovante();
		contaCorrente.debitarValor(10);
		contaCorrente.validarSaldo(30);

	}

}
