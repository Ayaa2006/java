import java.sql.Date;

public class reservation {
    private int id_reservation;
    private int id_user;    
    private int id_event;
    private int id_salle;
    private int id_terrain;
    private Date date_reservation;

    public reservation(int id_reservation, int id_user, int id_event, int id_salle, int id_terrain, Date date_reservation) {
        this.id_reservation = id_reservation;
        this.id_user = id_user;
        this.id_event = id_event;
        this.id_salle = id_salle;
        this.id_terrain = id_terrain;
        this.date_reservation = date_reservation;
    }

    public Date getDateReservation() {
        return date_reservation;
    }

    public void setId(int id) {
        this.id_reservation = id;
    }
    public int getId() {
        return id_reservation;
    }

    public int getUserId() {
        return id_user;
    }

    public void setUserId(int userId) {
        this.id_user = userId;
    }

    public int getEventId() {
        return id_event;
    }

    public void setEventId(int id_event) {
        this.id_event = id_event;
    }

    public int getSalleId() {
        return id_salle;
    }

    public void setSalleId(int id_salle) {
        this.id_salle = id_salle;
    }

    public int getTerrainId() {
        return id_terrain;
    }

    public void setTerrainId(int id_terrain) {
        this.id_terrain = id_terrain;
    }
}
