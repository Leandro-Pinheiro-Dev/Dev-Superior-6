package injeção.de.Dependencia.Entities_Interfaces;

import java.time.LocalDate;

public class Installment { //CLASSE QUE REPRESENTA AS PARCELAS DE UM CONTRATO
	
	// DECLARAÇÃO DOS ATRIBUTOS PRIVADOS
	private LocalDate date; // ARMAZENA A DATA DE VENCIMENTO DA PARCELA
	private Double amount;  // ARMAZENA O VALOR DA PARCELA
	
	// CONSTRUTOR PADRÃO (SEM ARGUMENTOS)
	public Installment() {
	}

	// CONSTRUTOR SOBRECARREGADO
	// INICIALIZA OS ATRIBUTOS DATE E AMOUNT COM OS VALORES FORNECIDOS
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	// MÉTODO GETTER PARA O ATRIBUTO DATE
	// RETORNA A DATA DA PARCELA
	public LocalDate getDate() {
		return date;
	}

	// MÉTODO SETTER PARA O ATRIBUTO DATE
	// PERMITE ALTERAR A DATA DA PARCELA
	public void setDate(LocalDate date) {
		this.date = date;
	}

	// MÉTODO GETTER PARA O ATRIBUTO AMOUNT
	// RETORNA O VALOR DA PARCELA
	public Double getAmount() {
		return amount;
	}

	// MÉTODO SETTER PARA O ATRIBUTO AMOUNT
	// PERMITE ALTERAR O VALOR DA PARCELA
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	// SOBRESCREVE O MÉTODO toString PARA FORNECER UMA REPRESENTAÇÃO LEGISÍVEL DO OBJETO
	@Override
	public String toString() {
		return String.format("Date: %s - Amount: %.2f", date, amount);
	}

}
