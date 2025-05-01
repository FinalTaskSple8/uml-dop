package SIPH.roommanagement.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class ManageRoomsServiceDecorator extends ManageRoomsServiceComponent{
	protected ManageRoomsServiceComponent record;

    public ManageRoomsServiceDecorator(ManageRoomsServiceComponent record) {
        this.record = record;
    }

	public ManageRoomsImpl createManageRooms(Map<String, Object> requestBody){
		return record.createManageRooms(requestBody);
	}

    public ManageRooms createManageRooms(Map<String, Object> requestBody, Map<String, Object> response){
		return record.createManageRooms(requestBody, response);
	}

	public HashMap<String, Object> getManageRooms(Map<String, Object> requestBody){
		return record.getManageRooms(requestBody);
	}

	public List<HashMap<String,Object>> getAllManageRooms(Map<String, Object> requestBody){
		return record.getAllManageRooms(requestBody);
	}

    public List<HashMap<String,Object>> saveManageRooms(VMJExchange vmjExchange){
		return record.saveManageRooms(vmjExchange);
	}

    public HashMap<String, Object> updateManageRooms(Map<String, Object> requestBody){
		return record.updateManageRooms(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<ManageRooms> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> deleteManageRooms(Map<String, Object> requestBody){
		return record.deleteManageRooms(requestBody);
	}

	public HashMap<String, Object> getManageRoomsById(int id){
        return record.getManageRoomsById(id);
    }

	public EByteArray getRoomByHotelId() {
		return record.getRoomByHotelId();
	}
}
