package entities;

import java.io.Serializable;

public class Room implements Serializable {
    private final Integer capacity;
    private  final Integer roomNumber;

    public Room(Integer roomNumber) {
        this.capacity = 60;
        this.roomNumber = roomNumber;
    }

    public Integer getCapacity(){return capacity;}

    public Integer getRoomNumber(){return capacity;}

}
