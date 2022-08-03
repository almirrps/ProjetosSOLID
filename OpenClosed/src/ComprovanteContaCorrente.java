public class ComprovanteContaCorrente {

	public void emitirComprovante() {
		System.out.println("Emitindo o comprovante...");		
	}

	//Feita uma sobrecarga do método emitirComprovante para não precisar alterar o método original
	public void emitirComprovante(String dataInicio, String dataFim) {
		System.out.println("Emitindo o comprovante de "+dataInicio+" até "+dataFim);		
	}

}
