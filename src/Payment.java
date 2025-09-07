public class Payment implements PaymentProcessor {
    protected String id;
    protected float value;
    protected String status;
    protected String method;



    public Payment(String id, float value, String status, String method) {
        this.id = id;
        this.value = value;
        this.status = status;
        this.method = method;
    }
    public Payment(String id, float value) {
        this(id, value, "PENDING", "UNDEFINED");
    }

    public boolean processPayment() {
        System.out.println("Pagamento aprovado");
        this.status = "approved";
        return true;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}