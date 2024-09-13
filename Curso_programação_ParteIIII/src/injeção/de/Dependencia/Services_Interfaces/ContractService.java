package injeção.de.Dependencia.Services_Interfaces;

import java.time.LocalDate;

import injeção.de.Dependencia.Entities_Interfaces.Contract;
import injeção.de.Dependencia.Entities_Interfaces.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService; // INSTÂNCIA DO SERVIÇO DE PAGAMENTO ONLINE

	// CONSTRUTOR QUE RECEBE UMA IMPLEMENTAÇÃO DE OnlinePaymentService
	// INICIALIZA O ATRIBUTO onlinePaymentService
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	// MÉTODO PARA PROCESSAR O CONTRATO E GERAR AS PARCELAS
	public void processContract(Contract contract, int months) {
		
		// CALCULA A COTA BÁSICA (VALOR TOTAL DIVIDIDO PELO NÚMERO DE PARCELAS)
		double basicQuota = contract.getTotalValue() / months;
		
		// LOOP PARA CALCULAR E ADICIONAR CADA PARCELA
		for (int i = 1; i <= months; i++) {
			// CALCULA A DATA DE VENCIMENTO DE CADA PARCELA
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			// CALCULA OS JUROS PARA A PARCELA CORRESPONDENTE
			double interest = onlinePaymentService.Interest(basicQuota, i);
			
			// CALCULA A TAXA DE PAGAMENTO PARA A PARCELA, INCLUINDO JUROS
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			
			// CALCULA O VALOR FINAL DA PARCELA, INCLUINDO COTA BÁSICA, JUROS E TAXA
			double quota = basicQuota + interest + fee; 
			
			// ADICIONA A PARCELA À LISTA DE PARCELAS DO CONTRATO
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
