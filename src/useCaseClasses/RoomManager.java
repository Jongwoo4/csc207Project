package useCaseClasses;

import entities.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private final List<Room> rooms;

    public RoomManager(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Integer> getRoomNumbers() {
        List<Integer> roomNum = new ArrayList<>();
        for (Room room:rooms){
            roomNum.add(room.getRoomNumber());
        }
        return roomNum;
    }

}
