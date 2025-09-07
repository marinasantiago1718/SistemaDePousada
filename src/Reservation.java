import java.time.Duration;
import java.time.LocalDateTime;

public class Reservation {

    private int id;
    private Room room;
    private Guest guest;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;

    public Reservation(int id, Room room, Guest guest, LocalDateTime arrivalDate, LocalDateTime departureDate) {
        this.id = id;
        this.room = room;
        this.guest = guest;
        this.arrivalDate = arrivalDate;
    }



    public float calculateValue() {
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
