import java.awt.geom.QuadCurve2D;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Reservation implements ReservationProcessor{
    Scanner scanner = new Scanner(System.in);

    RoomManager roomManager = new RoomManager();

    private boolean status;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;
    private float value;


    public void confirmReservation(){
        CheckIn checkIn = new CheckIn();
        arrivalDate = checkIn.registrateArrival();

    }

    public void updateRoomStatus(int roomNumber) {
        roomManager.getRooms().get(roomNumber).setStatus(!roomManager.getRooms().get(roomNumber).isStatus());
    }

    @Override
    public void bookRoom(int roomNumber) {
        updateRoomStatus(roomNumber);

        System.out.println("Qual a quantidade de hóspedes do quarto?");
        byte guests = scanner.nextByte();

        for (byte i = 0; i < guests; i++) {

            Guest guest = new Guest();

            System.out.println("Qual o nome do " + (i+1) + "° hóspede.");
            String guestName = scanner.next();
            guest.setName(guestName);

            System.out.println("Qual o telefone do " + (i+1) + "° hóspede.");
            String guestPhone = scanner.next();
            guest.setPhoneNumber(guestPhone);

            System.out.println("Qual o CPF do " + (i+1) + "° hóspede.");
            String guestCPF = scanner.next();
            guest.setCPF(guestCPF);

            System.out.println("Qual o email do " + (i+1) + "° hóspede.");
            String email = scanner.next();
            guest.setEmail(email);

            Room room = roomManager.getRooms().get(roomNumber);
            room.getGuests().add(guest);

        }

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }





}
