public interface IReservationManager {

    void addReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    void listAvalibleRooms();
}
