package SIPH.roommanagement.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class ManageRoomsResourceComponent implements ManageRoomsResource{
	
	public ManageRoomsResourceComponent() { }
 
    public abstract ManageRooms createManageRooms(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> updateManageRooms(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> getManageRooms(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAllManageRooms(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> deleteManageRooms(VMJExchange vmjExchange);

	public abstract EByteArray getRoomByHotelId();
}
