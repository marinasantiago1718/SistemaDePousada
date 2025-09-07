public class PaymentManager {
    public void managePayment(PaymentProcessor processor){
        boolean success = processor.processPayment();
        if(success){
            System.out.println("Pagamento processado com sucesso.");
        } else {
            System.out.println("Falha de pagamento.");
        }
    }
}
