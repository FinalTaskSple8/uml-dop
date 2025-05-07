package SIPH.room.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface RoomService {
	Room createRoom(Map<String, Object> requestBody);
	Room createRoom(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getRoom(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveRoom(Map<String, Object> requestBody);
    HashMap<String, Object> updateRoom(Map<String, Object> requestBody);
    HashMap<String, Object> getRoomById(int id);
    List<HashMap<String,Object>> getAllRoom(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteRoom(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
