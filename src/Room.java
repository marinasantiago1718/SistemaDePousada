import java.util.List;

public class Room {

    private int roomNumber;
    private byte numSingleBed;
    private byte numDoubleBedCamaCasa;
    private boolean status;
    private List<Guest> guests;
    private float dailyPrice;

    public Room(int roomNumber, byte numSingleBed, byte numDoubleBedCamaCasa, boolean status, List<Guest> guests, float dailyPrice) {
        this.roomNumber = roomNumber;
        this.numSingleBed = numSingleBed;
        this.numDoubleBedCamaCasa = numDoubleBedCamaCasa;
        this.status = status;
        this.guests = guests;
        this.dailyPrice = dailyPrice;
    }

    public boolean isAvailable(){
        return status==true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public byte getNumSingleBed() {
        return numSingleBed;
    }

    public void setNumSingleBed(byte numSingleBed) {
        this.numSingleBed = numSingleBed;
    }

    public byte getNumDoubleBedCamaCasa() {
        return numDoubleBedCamaCasa;
    }

    public void setNumDoubleBedCamaCasa(byte numDoubleBedCamaCasa) {
        this.numDoubleBedCamaCasa = numDoubleBedCamaCasa;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
