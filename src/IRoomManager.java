public interface IRoomManager {
    void listAvaiableRooms();
    String checkAvailability(int roomNumber);
    void addRoom(Room room);
    void deleteRoom(int roomNumber);
    void updateRoom( Room room);
}
