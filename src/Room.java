import java.util.List;

public class Room {

    private int roomNumber;
    private String status = "Available";
    private List<Guest> guests;
    private float dailyPrice;

    public Room(int roomNumber, String status, List<Guest> guests, float dailyPrice) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.guests = guests;
        this.dailyPrice = dailyPrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public float getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(float dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
}
