import java.time.LocalDateTime;

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



    public void doReservation(int id, Room room, Guest guest, LocalDateTime arrivalDate) {
        Reservation reservation = new Reservation(id, room, guest, arrivalDate);
        ReservationManager rm = new ReservationManager();

        rm.addReservation(reservation);
    }
}
