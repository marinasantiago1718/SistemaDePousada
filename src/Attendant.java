public class Attendant extends Employee{
    public Attendant(String name, String phoneNumber, String cPF, String email, String endereco) {
        super(name, phoneNumber, cPF, email, endereco);
    }

    private CheckIn checkIn = new CheckIn();
    private CheckOut checkOut = new CheckOut();


    @Override
    public void doReservation() {
//        Reservation reservation = new Reservation();
//        reservation.confirmReservation();
    }
}
