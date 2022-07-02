package work.demo.day23.work02;

import java.util.Objects;

public class Rooms {
    private int id;
    private String date;
    private boolean yes;

    public Rooms() {
    }

    public Rooms(int id, String date, boolean yes) {
        this.id = id;
        this.date = date;
        this.yes = yes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getYes() {
        return yes;
    }

    public void setYes(boolean yes) {
        this.yes = yes;
    }

    @Override
    public String toString() {
        return "["+id+"号房,"+date+(yes ? ",空闲" : ",以占用")+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rooms)) return false;
        Rooms rooms = (Rooms) o;
        return getId() == rooms.getId() && getYes() == rooms.getYes() && Objects.equals(getDate(), rooms.getDate());
    }

}
