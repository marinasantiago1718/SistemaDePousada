public class Employee extends Person {

    private String registration;
    private CheckIn checkIn = new CheckIn();
    private CheckOut checkOut = new CheckOut();

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }


    @Override
    public void doReservation() {
//        Reservation reservation = new Reservation();
//        reservation.confirmReservation();
    }
}
