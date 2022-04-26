public class Main {
    public static void main(String[] args) {
        
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int monthlyPayment;
        int loanSum = 1_000_000;

        monthlyPayment = creditPaymentService.calculate(loanSum, 1);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);

        monthlyPayment = creditPaymentService.calculate(loanSum, 2);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);

        monthlyPayment = creditPaymentService.calculate(loanSum, 3);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);

    }
}
