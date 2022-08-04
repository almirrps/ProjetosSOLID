import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyApp {

	public static void main(String[] args) {
		
		//Criando os objetos principais
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		//Executando os métodos vinculados aos objetos principais
		System.out.println("***Movimentações de Conta Corrente***");
		contaCorrente.emitirComprovante();
		
		String strDataIni = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String strDataFim = LocalDateTime.now().plusDays(20).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		contaCorrente.emitirComprovante(strDataIni, strDataFim);
		
		contaCorrente.debitarValor(10);
		contaCorrente.validarSaldo(30);
		
		System.out.println("");
		System.out.println("***Movimentações de Conta Poupanca***");
		contaPoupanca.debitarValor(25);

	}

}
