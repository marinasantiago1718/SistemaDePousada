import java.time.LocalDateTime;

public class Employee extends Person {

    private String registration;
    ReservationManager rm;


    public Employee(String name, String phoneNumber, String cPF, String email, String endereco, String registration, ReservationManager rm) {
        super(name, phoneNumber, cPF, email, endereco);
        this.registration = registration;
        this.rm = rm;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }



    public void doReservation(int id, Room room, Guest guest, LocalDateTime arrivalDate) {
        Reservation reservation = new Reservation(id, room, guest, arrivalDate);

        rm.addReservation(reservation);
    }
}
