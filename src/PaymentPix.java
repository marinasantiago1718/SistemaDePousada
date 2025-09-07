public class PaymentPix extends Payment{
    public PaymentPix(String id, float value, String status, String method) {
        super(id, value, status, method);
    }

    public PaymentPix(String id, float value){
        super(id, value, "pending", "undefined");
    }

    public boolean processPayment() {
        System.out.println("Pagamento no pix aprovado");
        this.status = "approved";
        return true;
    }
}