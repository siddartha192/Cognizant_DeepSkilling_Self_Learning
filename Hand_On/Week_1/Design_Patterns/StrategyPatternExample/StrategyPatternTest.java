public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentContext context = new PaymentContext(creditCard);

        context.makePayment(5000.90);
        context.setPaymentStrategy(new PayPalPayment());

        context.makePayment(7000.25);
    }
}
