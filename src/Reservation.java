import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Reservation {

    private int id;
    private Room room;
    private Guest guest;
    private Payment payment;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;

    public Reservation(int id, Room room, Guest guest, Payment payment, LocalDateTime arrivalDate, LocalDateTime departureDate) {
        this.id = id;
        this.room = room;
        this.guest = guest;
        this.payment = payment;
        this.arrivalDate = arrivalDate;
    }

    public float calcularValor() {
        Duration duration = Duration.between(arrivalDate, departureDate);
        return room.getDailyPrice()*(duration.toHours()/24f);
    }

    public int getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArraivalDate(LocalDateTime arraivalDate) {
        this.arrivalDate = arraivalDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

}
