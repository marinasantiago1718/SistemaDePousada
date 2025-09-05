import java.util.HashMap;

public class RoomManager implements IRoomManager {
    private HashMap<Integer, Room> rooms;

    @Override
    public void updateRoomQuantity(Room room) {
        rooms.put(room.getRoomNumber(),room) ;
    }

    @Override
    public void listAvaiableRooms() {
        byte avaiableRooms = 0;
        System.out.println("Quartos disponíveis:");

        for(Room room:rooms.values()){
            System.out.println("Quartos disponíveis:");

            if(room.isAvailable()){
                System.out.println(room.getRoomNumber());
                avaiableRooms++;
         }

        if (avaiableRooms==0){
         System.out.println("Nenhum.");
         }
        }
    }

    @Override
    public String checkAvailability(int roomNumber) {
     Room room = rooms.get(roomNumber);
     if(room.isAvailable()){
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
