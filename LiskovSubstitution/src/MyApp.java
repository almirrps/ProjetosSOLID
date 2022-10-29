public class MyApp {
	public static void main(String[] args) {
		
		//Criando os objetos principais
		ContaCorrente contaCorrente = new ContaCorrente();
		
		//Executando os métodos vinculados aos objetos principais
		System.out.println("***Movimentações de Conta Corrente***");
		
		contaCorrente.debitarValorContaCorrente(10);
		contaCorrente.debitarValor(30);
	}

}
