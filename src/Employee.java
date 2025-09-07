public class Employee extends Person {

    private String registration;


    public Employee(String name, String phoneNumber, String cPF, String email, String endereco) {
        super(name, phoneNumber, cPF, email, endereco);
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }



    public void doReservation() {
//        Reservation reservation = new Reservation();
//        reservation.confirmReservation();
    }
}
