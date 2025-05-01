package SIPH.roommanagement.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface ManageRoomsResource {
    List<HashMap<String,Object>> saveManageRooms(VMJExchange vmjExchange);
    HashMap<String, Object> updateManageRooms(VMJExchange vmjExchange);
    HashMap<String, Object> getManageRooms(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllManageRooms(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteManageRooms(VMJExchange vmjExchange);
	HashMap<String, Object> createManageRooms(VMJExchange vmjExhange);
}
