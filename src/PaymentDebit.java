public class PaymentDebit extends Payment{
    public PaymentDebit(String id, float value, String status, String method) {
        super(id, value, status, "debit");
    }

    public boolean processPayment() {
        System.out.println("Pagamento no débito aprovado");
        this.status = "approved";
        return true;
    }
}