public class MyApp {

	public static void main(String[] args) {
	
		//Criando os objetos principais
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		//Executando os métodos vinculados aos objetos principais
		System.out.println("***Movimentações de Conta Corrente***");
		contaCorrente.emitirExtrato();
		contaCorrente.debitarValorDebito(50);
		contaCorrente.debitarValorCredito(30);
		contaCorrente.solicitarTalaoCheque();
		contaCorrente.realizarPIX(70);
				
		System.out.println("");
		System.out.println("***Movimentações de Conta Poupanca***");
		contaPoupanca.emitirExtrato();
		contaPoupanca.debitarValorDebito(50);
		contaPoupanca.realizarTED(25);
		contaPoupanca.realizarDOC(90);
		
		//**Conta Poupança não realiza os três serviços abaixo
		//contaPoupanca.debitarValorCredito(30);
		//contaPoupanca.solicitarTalaoCheque();
		//contaPoupanca.realizarPIX(70);

	}

}
