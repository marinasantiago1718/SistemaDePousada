public class PaymentCredit extends Payment{
    public PaymentCredit(String id, float value, String status, String method) {
        super(id, value, status, "credit");
    }

    public boolean processPayment() {
        System.out.println("Pagamento no crédito aprovado");
        this.status = "approved";
        return true;
    }
}