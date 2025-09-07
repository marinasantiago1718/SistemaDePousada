import java.util.HashMap;

public class RoomManager implements IRoomManager {
    private HashMap<Integer, Room> rooms;


    @Override
    public void deleteRoom(int roomNumber) {
        rooms.entrySet().removeIf(entry -> entry.getValue().getRoomNumber()==roomNumber);
    }

    @Override
    public void updateRoom( Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    @Override
    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(),room) ;
    }

    @Override
    public void listAvailableRooms() {

        byte avaiableRooms = 0;
        System.out.println("Quartos disponíveis:");

        for(Room room:rooms.values()){
            System.out.println("Quartos disponíveis:");

            if(room.getStatus().equals("Available")){
                System.out.println(room.getRoomNumber());
                avaiableRooms++;
            }

            if (avaiableRooms==0){
                System.out.println("Nenhum.");
            }
        }
    }


    @Override
    public void listAvailableRooms() {

    }

    @Override
    public String checkAvailability(int roomNumber) {
     Room room = rooms.get(roomNumber);
     if(room.getStatus().equals("Available")){
         return "O quarto " + roomNumber + " está disponível";
     }
     return "O quarto " + roomNumber + " não está disponível";
    }


    public HashMap<Integer, Room> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, Room> rooms) {
        this.rooms = rooms;
    }
}
