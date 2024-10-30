package payment_method_application.strategies;

public interface PayStrategy {
    void collectPaymentDetails();
    boolean pay(int paymentAmount);
}
