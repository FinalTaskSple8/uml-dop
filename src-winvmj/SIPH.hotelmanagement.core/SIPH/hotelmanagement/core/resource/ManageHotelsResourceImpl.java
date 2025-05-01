package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.hotelmanagement.ManageHotelsFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class ManageHotelsResourceImpl extends ManageHotelsResourceComponent{
	
	private ManageHotelsServiceImpl managehotelsServiceImpl = new ManageHotelsServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/hotelmanagement")
    public HashMap<String,Object> createmanagehotels(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			ManageHotels result = managehotelsServiceImpl.createManageHotels(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/hotelmanagement/update")
    public HashMap<String, Object> updateManageHotels(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return managehotelsServiceImpl.updateManageHotels(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/hotelmanagement/detail")
    public HashMap<String, Object> getManageHotels(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return managehotelsServiceImpl.getManageHotels(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/hotelmanagement/list")
    public List<HashMap<String,Object>> getAllManageHotels(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return managehotelsServiceImpl.getAllManageHotels(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/hotelmanagement/delete")
    public List<HashMap<String,Object>> deleteManageHotels(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return managehotelsServiceImpl.deleteManageHotels(requestBody);
	}

	public void addRoomToHotel(ManageRooms rooms) {
		// TODO: implement this method
	}
}
