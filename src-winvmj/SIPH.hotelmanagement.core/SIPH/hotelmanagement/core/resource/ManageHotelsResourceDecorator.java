package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

public abstract class ManageHotelsResourceDecorator extends ManageHotelsResourceComponent{
	protected ManageHotelsResourceComponent record;

    public ManageHotelsResourceDecorator(ManageHotelsResourceComponent record) {
        this.record = record;
    }

    public ManageHotels createManageHotels(VMJExchange vmjExchange){
		return record.createManageHotels(vmjExchange);
	}

    public HashMap<String, Object> updateManageHotels(VMJExchange vmjExchange){
		return record.updateManageHotels(vmjExchange);
	}

    public HashMap<String, Object> getManageHotels(VMJExchange vmjExchange){
		return record.getManageHotels(vmjExchange);
	}

    public List<HashMap<String,Object>> getAllManageHotels(VMJExchange vmjExchange){
		return record.getAllManageHotels(vmjExchange);
	}

    public List<HashMap<String,Object>> deleteManageHotels(VMJExchange vmjExchange){
		return record.deleteManageHotels(vmjExchange);
	}

	public void addRoomToHotel(ManageRooms rooms) {
		return record.addRoomToHotel(rooms);
	}
}
