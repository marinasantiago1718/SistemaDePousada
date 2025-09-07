public class Payment implements PaymentProcessor {
    private String id;

    private float value;

    private String status;

    private String method;


    public boolean processarPagamento(float value) {
        System.out.println("pagamento aprovado");
        return true;
    }
}