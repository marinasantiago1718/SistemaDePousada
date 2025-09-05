public class Employee extends Person {

    private String registration;
//    private CheckIn checkIn;
//    private CheckIn checkOut;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }


    @Override
    public void doReservation() {
        super.doReservation();
    }
}
