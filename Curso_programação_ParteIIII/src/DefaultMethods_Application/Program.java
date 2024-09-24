package DefaultMethods_Application;

import java.util.Locale;
import java.util.Scanner;

import DefaultMethods_Services.BrazilInterestService;
import DefaultMethods_Services.InterestService;

public class Program {

    // ESTE PROGRAMA SIMULA UM SERVIÇO DE CÁLCULO DE JUROS SIMPLES.
    // O USUÁRIO INFORMA UM MONTANTE E A QUANTIDADE DE MESES, E O SISTEMA CALCULA O VALOR FINAL A PAGAR
    // APÓS A APLICAÇÃO DE UMA TAXA DE JUROS DEFINIDA PELO SERVIÇO DE JUROS SELECIONADO (EX.: BRASIL).
    // O CÁLCULO É FEITO USANDO UM MÉTODO PADRÃO DEFINIDO NA INTERFACE `InterestService`.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // SOLICITA E LÊ O VALOR (AMOUNT) DO USUÁRIO
        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        // SOLICITA E LÊ O NÚMERO DE MESES (MONTHS) DO USUÁRIO
        System.out.print("Months: ");
        int months = sc.nextInt();

        // CRIA UM SERVIÇO DE JUROS ESPECÍFICO PARA O BRASIL COM TAXA DE 2.0%
        InterestService is = new BrazilInterestService(2.0);

        // CALCULA O VALOR DO PAGAMENTO USANDO A TAXA DE JUROS E O TEMPO
        double payment = is.payment(amount, months);

        // EXIBE O VALOR DO PAGAMENTO APÓS OS MESES DEFINIDOS
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        // FECHA O SCANNER PARA EVITAR VAZAMENTO DE RECURSOS
        sc.close();
    } 
}
