package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class ManageHotelsResourceComponent implements ManageHotelsResource{
	
	public ManageHotelsResourceComponent() { }
 
    public abstract ManageHotels createManageHotels(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> updateManageHotels(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> getManageHotels(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAllManageHotels(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> deleteManageHotels(VMJExchange vmjExchange);

	public abstract void addRoomToHotel(ManageRooms rooms);
}
