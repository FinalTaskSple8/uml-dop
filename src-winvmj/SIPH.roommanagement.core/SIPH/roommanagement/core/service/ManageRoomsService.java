package SIPH.roommanagement.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface ManageRoomsService {
	ManageRooms createManageRooms(Map<String, Object> requestBody);
	ManageRooms createManageRooms(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getManageRooms(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveManageRooms(Map<String, Object> requestBody);
    HashMap<String, Object> updateManageRooms(Map<String, Object> requestBody);
    HashMap<String, Object> getManageRoomsById(int id);
    List<HashMap<String,Object>> getAllManageRooms(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteManageRooms(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
