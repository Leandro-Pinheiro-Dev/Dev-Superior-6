package injeção.de.Dependencia.Services_Interfaces;

public class PaypalService implements OnlinePaymentService {//IMPLEMENTAÇÃO DO SERVIÇO DE PAGAMENTO ONLINE USANDO PAYPAL
	
	// CALCULA A TAXA DE PAGAMENTO COMO 2% DO MONTANTE (amount)
	public double paymentFee(double amount) {
		return amount * 0.02; // RETORNA 2% DO MONTANTE COMO TAXA
	}
	// CALCULA OS JUROS COMO 1% DO MONTANTE (amount) POR MÊS
	public double Interest(double amount, int months) {
		return amount * 0.01 * months; // RETORNA 1% DO MONTANTE POR MÊS MULTIPLICADO PELO NÚMERO DE MESES
	}
}
