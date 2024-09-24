package DefaultMethods_Services;

import java.security.InvalidParameterException;

// INTERFACE QUE DEFINE O SERVIÇO DE JUROS
public interface InterestService {

    // MÉTODO ABSTRATO QUE OBTÉM A TAXA DE JUROS
    double getInterestRate();

    // MÉTODO PADRÃO QUE CALCULA O PAGAMENTO COM BASE NO MONTANTE E NO TEMPO
    default double payment(double amount, int months) {
        // VERIFICA SE O NÚMERO DE MESES É VÁLIDO
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        // FÓRMULA QUE CALCULA O PAGAMENTO TOTAL APLICANDO A TAXA DE JUROS
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
