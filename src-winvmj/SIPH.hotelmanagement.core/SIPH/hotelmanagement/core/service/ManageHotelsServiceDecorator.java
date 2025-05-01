package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class ManageHotelsServiceDecorator extends ManageHotelsServiceComponent{
	protected ManageHotelsServiceComponent record;

    public ManageHotelsServiceDecorator(ManageHotelsServiceComponent record) {
        this.record = record;
    }

	public ManageHotelsImpl createManageHotels(Map<String, Object> requestBody){
		return record.createManageHotels(requestBody);
	}

    public ManageHotels createManageHotels(Map<String, Object> requestBody, Map<String, Object> response){
		return record.createManageHotels(requestBody, response);
	}

	public HashMap<String, Object> getManageHotels(Map<String, Object> requestBody){
		return record.getManageHotels(requestBody);
	}

	public List<HashMap<String,Object>> getAllManageHotels(Map<String, Object> requestBody){
		return record.getAllManageHotels(requestBody);
	}

    public List<HashMap<String,Object>> saveManageHotels(VMJExchange vmjExchange){
		return record.saveManageHotels(vmjExchange);
	}

    public HashMap<String, Object> updateManageHotels(Map<String, Object> requestBody){
		return record.updateManageHotels(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<ManageHotels> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> deleteManageHotels(Map<String, Object> requestBody){
		return record.deleteManageHotels(requestBody);
	}

	public HashMap<String, Object> getManageHotelsById(int id){
        return record.getManageHotelsById(id);
    }

	public void addRoomToHotel(ManageRooms rooms) {
		return record.addRoomToHotel(rooms);
	}
}
