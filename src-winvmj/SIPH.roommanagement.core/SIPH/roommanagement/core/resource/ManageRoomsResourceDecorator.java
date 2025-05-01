package SIPH.roommanagement.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

public abstract class ManageRoomsResourceDecorator extends ManageRoomsResourceComponent{
	protected ManageRoomsResourceComponent record;

    public ManageRoomsResourceDecorator(ManageRoomsResourceComponent record) {
        this.record = record;
    }

    public ManageRooms createManageRooms(VMJExchange vmjExchange){
		return record.createManageRooms(vmjExchange);
	}

    public HashMap<String, Object> updateManageRooms(VMJExchange vmjExchange){
		return record.updateManageRooms(vmjExchange);
	}

    public HashMap<String, Object> getManageRooms(VMJExchange vmjExchange){
		return record.getManageRooms(vmjExchange);
	}

    public List<HashMap<String,Object>> getAllManageRooms(VMJExchange vmjExchange){
		return record.getAllManageRooms(vmjExchange);
	}

    public List<HashMap<String,Object>> deleteManageRooms(VMJExchange vmjExchange){
		return record.deleteManageRooms(vmjExchange);
	}

	public EByteArray getRoomByHotelId() {
		return record.getRoomByHotelId();
	}
}
