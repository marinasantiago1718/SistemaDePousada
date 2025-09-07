import java.util.Scanner;

public class ReservationManager implements IReservationManager {

    Scanner scanner = new Scanner(System.in);

    RoomManager roomManager = new RoomManager();




    public void confirmReservation(){
//        CheckIn checkIn = new CheckIn();
//        arrivalDate = checkIn.registrateArrival();

    }

    public void updateRoomStatus(int roomNumber) {
        if(roomManager.getRooms().get(roomNumber).getStatus().equals("Available")){
            roomManager.getRooms().get(roomNumber).setStatus("Occupied");
        } else{
            roomManager.getRooms().get(roomNumber).setStatus("Available");
        }

    }

    public void bookRoom(int roomNumber){
        updateRoomStatus(roomNumber);

        System.out.println("Qual a quantidade de hóspedes do quarto?");
        byte guests = scanner.nextByte();

        for (byte i = 0; i < guests; i++) {



            System.out.println("Qual o nome do " + (i+1) + "° hóspede.");
            String guestName = scanner.next();


            System.out.println("Qual o telefone do " + (i+1) + "° hóspede.");
            String guestPhone = scanner.next();


            System.out.println("Qual o CPF do " + (i+1) + "° hóspede.");
            String guestCPF = scanner.next();


            System.out.println("Qual o email do " + (i+1) + "° hóspede.");
            String email = scanner.next();

            System.out.println("Qual o endereço do " + (i+1) + "° hóspede.");
            String adress = scanner.next();


            Guest guest = new Guest(guestName, guestPhone, guestCPF, email, adress);

            Room room = roomManager.getRooms().get(roomNumber);
            room.getGuests().add(guest);

        }

    }

    @Override
    public void addReservation(Reservation reservation) {

    }

    @Override
    public void deleteReservation(Reservation reservation) {

    }

    @Override
    public void updateReservation(Reservation reservation) {

    }

    @Override
    public void listAvalibleRooms() {

    }


}
