public interface IRoomManager {
    void listAvailableRooms();

    String checkAvailability(int roomNumber);
    void addRoom(Room room);
    void deleteRoom(int roomNumber);
    void updateRoom( Room room);
}
