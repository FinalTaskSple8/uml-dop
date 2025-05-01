package SIPH.roommanagement.core;
import java.util.*;
import com.google.gson.Gson;
import java.util.*;
import java.util.logging.Logger;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.roommanagement.ManageRoomsFactory;
import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class ManageRoomsServiceImpl extends ManageRoomsServiceComponent{

    public List<HashMap<String,Object>> saveManageRooms(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		ManageRooms managerooms = createManageRooms(vmjExchange);
		manageroomsRepository.saveObject(managerooms);
		return getAllManageRooms(vmjExchange);
	}

    public ManageRooms createManageRooms(Map<String, Object> requestBody){
		String hotelIdStr = (String) requestBody.get("hotelId");
		int hotelId = Integer.parseInt(hotelIdStr);
		String numberStr = (String) requestBody.get("number");
		int number = Integer.parseInt(numberStr);
		String type = (String) requestBody.get("type");
		String priceStr = (String) requestBody.get("price");
		int price = Integer.parseInt(priceStr);
		boolean isAvailable = (boolean) requestBody.get("isAvailable");
		
		//to do: fix association attributes
		ManageRooms ManageRooms = ManageRoomsFactory.createManageRooms(
			"SIPH.roommanagement.core.ManageRoomsImpl",
		hotelId
		, number
		, type
		, price
		, isAvailable
		, managehotelsimpl
		);
		Repository.saveObject(managerooms);
		return managerooms;
	}

    public ManageRooms createManageRooms(Map<String, Object> requestBody, int id){
		String hotelIdStr = (String) vmjExchange.getRequestBodyForm("hotelId");
		int hotelId = Integer.parseInt(hotelIdStr);
		String numberStr = (String) vmjExchange.getRequestBodyForm("number");
		int number = Integer.parseInt(numberStr);
		String type = (String) vmjExchange.getRequestBodyForm("type");
		String priceStr = (String) vmjExchange.getRequestBodyForm("price");
		int price = Integer.parseInt(priceStr);
		boolean isAvailable = (boolean) vmjExchange.getRequestBodyForm("isAvailable");
		
		//to do: fix association attributes
		
		ManageRooms managerooms = ManageRoomsFactory.createManageRooms("SIPH.roommanagement.core.ManageRoomsImpl", hotelId, number, type, price, isAvailable, managehotelsimpl);
		return managerooms;
	}

    public HashMap<String, Object> updateManageRooms(Map<String, Object> requestBody){
		String idStr = (String) requestBody.get("hotelId");
		int id = Integer.parseInt(idStr);
		ManageRooms managerooms = Repository.getObject(id);
		
		String hotelIdStr = (String) requestBody.get("hotelId");
		managerooms.setHotelId(Integer.parseInt(hotelIdStr));
		String numberStr = (String) requestBody.get("number");
		managerooms.setNumber(Integer.parseInt(numberStr));
		managerooms.setType((String) requestBody.get("type"));
		String priceStr = (String) requestBody.get("price");
		managerooms.setPrice(Integer.parseInt(priceStr));
		managerooms.setIsAvailable((String) requestBody.get("isAvailable"));
		
		Repository.updateObject(managerooms);
		
		//to do: fix association attributes
		
		return managerooms.toHashMap();
		
	}

    public HashMap<String, Object> getManageRooms(Map<String, Object> requestBody){
		List<HashMap<String, Object>> manageroomsList = getAllManageRooms("managerooms_impl");
		for (HashMap<String, Object> managerooms : manageroomsList){
			int record_id = ((Double) managerooms.get("record_id")).intValue();
			if (record_id == id){
				return managerooms;
			}
		}
		return null;
	}

	public HashMap<String, Object> getManageRoomsById(int id){
		String idStr = vmjExchange.getGETParam("hotelId"); 
		int id = Integer.parseInt(idStr);
		ManageRooms managerooms = manageroomsRepository.getObject(id);
		return managerooms.toHashMap();
	}

    public List<HashMap<String,Object>> getAllManageRooms(Map<String, Object> requestBody){
		String table = (String) requestBody.get("table_name");
		List<ManageRooms> List = Repository.getAllObject(table);
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<ManageRooms> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

    public List<HashMap<String,Object>> deleteManageRooms(Map<String, Object> requestBody){
		String idStr = ((String) requestBody.get("id"));
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAllManageRooms(requestBody);
	}

	public EByteArray getRoomByHotelId() {
		// TODO: implement this method
	}
}
