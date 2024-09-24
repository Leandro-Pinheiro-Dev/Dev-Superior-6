package DefaultMethods_Services;

// IMPLEMENTA O SERVIÇO DE JUROS PARA O BRASIL
public class BrazilInterestService implements InterestService {

    // ARMAZENA A TAXA DE JUROS
    private double interestRate;

    // CONSTRUTOR QUE RECEBE A TAXA DE JUROS COMO PARÂMETRO
    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    // MÉTODO QUE RETORNA A TAXA DE JUROS ATUAL
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
