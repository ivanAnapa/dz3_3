import static java.lang.Math.pow;

public class CreditPaymentService {
    public int calculate(int loanSum, int numberOfYears) {

        double monthlyPayment;
        double monthlyRate = 9.99 / (100 * 12);
        int numberOfMonths = numberOfYears * 12;

        monthlyPayment = loanSum * (monthlyRate / (1 - (pow(1 + monthlyRate, -numberOfMonths))));
        return (int) monthlyPayment;
    }
}
