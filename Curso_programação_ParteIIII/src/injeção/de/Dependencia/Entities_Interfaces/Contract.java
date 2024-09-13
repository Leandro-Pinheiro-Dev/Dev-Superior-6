package injeção.de.Dependencia.Entities_Interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract { // CLASSE QUE REPRESENTA UM CONTRATO DE PAGAMENTO
	
	// DECLARAÇÃO DOS ATRIBUTOS PRIVADOS
	private Integer number;      // ARMAZENA O NÚMERO DO CONTRATO
	private LocalDate date;      // ARMAZENA A DATA DO CONTRATO
	private Double totalValue;   // ARMAZENA O VALOR TOTAL DO CONTRATO
	
	// LISTA PARA ARMAZENAR AS PARCELAS RELACIONADAS AO CONTRATO
	private List<Installment> installments = new ArrayList<>();
	
	// CONSTRUTOR PADRÃO (SEM ARGUMENTOS)
	public Contract() {
	}
	// CONSTRUTOR SOBRECARREGADO
	// INICIALIZA OS ATRIBUTOS NUMBER, DATE E TOTALVALUE COM OS VALORES FORNECIDOS
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	// RETORNA O NÚMERO DO CONTRATO
	public Integer getNumber() {
		return number;
	}
	// PERMITE ALTERAR O NÚMERO DO CONTRATO
	public void setNumber(Integer number) {
		this.number = number;
	}
	// RETORNA A DATA DO CONTRATO
	public LocalDate getDate() {
		return date;
	}
	// PERMITE ALTERAR A DATA DO CONTRATO
	public void setDate(LocalDate date) {
		this.date = date;
	}
	// RETORNA O VALOR TOTAL DO CONTRATO
	public Double getTotalValue() {
		return totalValue;
	}

	// PERMITE ALTERAR O VALOR TOTAL DO CONTRATO
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	// RETORNA A LISTA DE PARCELAS ASSOCIADAS AO CONTRATO
	public List<Installment> getInstallments() {
		return installments;
	}
}
