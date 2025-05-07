package SIPH.room.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class RoomServiceDecorator extends RoomServiceComponent{
	protected RoomServiceComponent record;

    public RoomServiceDecorator(RoomServiceComponent record) {
        this.record = record;
    }

	public RoomImpl createRoom(Map<String, Object> requestBody){
		return record.createRoom(requestBody);
	}

    public Room createRoom(Map<String, Object> requestBody, Map<String, Object> response){
		return record.createRoom(requestBody, response);
	}

	public HashMap<String, Object> getRoom(Map<String, Object> requestBody){
		return record.getRoom(requestBody);
	}

	public List<HashMap<String,Object>> getAllRoom(Map<String, Object> requestBody){
		return record.getAllRoom(requestBody);
	}

    public List<HashMap<String,Object>> saveRoom(VMJExchange vmjExchange){
		return record.saveRoom(vmjExchange);
	}

    public HashMap<String, Object> updateRoom(Map<String, Object> requestBody){
		return record.updateRoom(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<Room> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> deleteRoom(Map<String, Object> requestBody){
		return record.deleteRoom(requestBody);
	}

	public HashMap<String, Object> getRoomById(int id){
        return record.getRoomById(id);
    }

	public Room getRoomByHotelId(int hotelId) {
		return record.getRoomByHotelId(hotelId);
	}
}
