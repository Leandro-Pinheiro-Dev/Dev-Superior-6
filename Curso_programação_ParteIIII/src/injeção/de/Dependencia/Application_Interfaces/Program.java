package injeção.de.Dependencia.Application_Interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import injeção.de.Dependencia.Entities_Interfaces.Contract;
import injeção.de.Dependencia.Entities_Interfaces.Installment;
import injeção.de.Dependencia.Services_Interfaces.ContractService;
import injeção.de.Dependencia.Services_Interfaces.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// DEFINE O FORMATO DA DATA COMO "DIA/MÊS/ANO"
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// ENTRADA DOS DADOS DO CONTRATO PELO USUÁRIO
		System.out.println("Entre os Dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();  // LÊ O NÚMERO DO CONTRATO
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);  // LÊ E FORMATA A DATA DO CONTRATO
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();  // LÊ O VALOR TOTAL DO CONTRATO
		
		// CRIA UM NOVO OBJETO CONTRATO COM OS DADOS FORNECIDOS
		Contract obj = new Contract(number, date, totalValue);
		
		// ENTRADA DO NÚMERO DE PARCELAS PELO USUÁRIO
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();  // LÊ O NÚMERO DE PARCELAS
		
		// CRIA UMA INSTÂNCIA DE ContractService UTILIZANDO PaypalService COMO DEPENDÊNCIA
		ContractService contractService = new ContractService(new PaypalService());
		
		// PROCESSA O CONTRATO, GERANDO AS PARCELAS COM BASE NO NÚMERO DE PARCELAS DEFINIDO
		contractService.processContract(obj, n); 
		
		// EXIBE AS PARCELAS GERADAS
		System.out.println("Parcelas: ");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);  // IMPRIME CADA PARCELA
		}
		sc.close(); 
	}
}
