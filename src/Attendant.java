import java.time.LocalDateTime;

public class Attendant extends Employee{
    public Attendant(String name, String phoneNumber, String cPF, String email, String endereco, String registration, ReservationManager rm) {
        super(name, phoneNumber, cPF, email, endereco, registration, rm);
    }

    @Override
    public void doReservation(int id, Room room, Guest guest, LocalDateTime arrivalDate) {
        super.doReservation(id, room, guest, arrivalDate);
    };
}
