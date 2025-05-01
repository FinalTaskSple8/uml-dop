package SIPH.roommanagement.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.roommanagement.ManageRoomsFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class ManageRoomsResourceImpl extends ManageRoomsResourceComponent{
	
	private ManageRoomsServiceImpl manageroomsServiceImpl = new ManageRoomsServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/roommanagement")
    public HashMap<String,Object> createmanagerooms(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			ManageRooms result = manageroomsServiceImpl.createManageRooms(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/roommanagement/update")
    public HashMap<String, Object> updateManageRooms(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return manageroomsServiceImpl.updateManageRooms(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/roommanagement/detail")
    public HashMap<String, Object> getManageRooms(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return manageroomsServiceImpl.getManageRooms(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/roommanagement/list")
    public List<HashMap<String,Object>> getAllManageRooms(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return manageroomsServiceImpl.getAllManageRooms(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/roommanagement/delete")
    public List<HashMap<String,Object>> deleteManageRooms(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return manageroomsServiceImpl.deleteManageRooms(requestBody);
	}

	public EByteArray getRoomByHotelId() {
		// TODO: implement this method
	}
}
