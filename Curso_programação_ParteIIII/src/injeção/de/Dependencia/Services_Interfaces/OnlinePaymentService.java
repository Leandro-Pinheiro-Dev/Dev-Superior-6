package injeção.de.Dependencia.Services_Interfaces;

public interface OnlinePaymentService { // INTERFACE QUE DEFINE OS SERVIÇOS DE PAGAMENTO ONLINE
	
	// MÉTODO PARA CALCULAR A TAXA DE PAGAMENTO
	// RECEBE O MONTANTE (amount) COMO PARÂMETRO E RETORNA A TAXA DE PAGAMENTO CORRESPONDENTE
	double paymentFee(double amount);
	
	// MÉTODO PARA CALCULAR OS JUROS
	// RECEBE O MONTANTE (amount) E O NÚMERO DE MESES (months) COMO PARÂMETROS
	// RETORNA O VALOR DOS JUROS COM BASE NOS PARÂMETROS FORNECIDOS
	double Interest(double amount, int months);
}
