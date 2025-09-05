public interface IRoomManager {
    void updateRoomQuantity(Room room);
    void listAvaiableRooms();
    String checkAvailability(int roomNumber);
}
