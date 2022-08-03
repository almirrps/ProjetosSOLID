import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyApp {

	public static void main(String[] args) {
		
		//Criando o objeto principal
		ContaCorrente contaCorrente = new ContaCorrente();
		
		//Executando os métodos vinculados ao objeto principal
		contaCorrente.emitirComprovante();
		
		String strDataIni = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String strDataFim = LocalDateTime.now().plusDays(20).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		contaCorrente.emitirComprovante(strDataIni, strDataFim);
		
		contaCorrente.debitarValor(10);
		contaCorrente.validarSaldo(30);

	}

}
