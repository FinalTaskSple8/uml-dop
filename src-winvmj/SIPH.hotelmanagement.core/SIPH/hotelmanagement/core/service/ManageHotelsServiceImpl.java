package SIPH.hotelmanagement.core;
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
import SIPH.hotelmanagement.ManageHotelsFactory;
import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class ManageHotelsServiceImpl extends ManageHotelsServiceComponent{

    public List<HashMap<String,Object>> saveManageHotels(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		ManageHotels managehotels = createManageHotels(vmjExchange);
		managehotelsRepository.saveObject(managehotels);
		return getAllManageHotels(vmjExchange);
	}

    public ManageHotels createManageHotels(Map<String, Object> requestBody){
		String id = (String) requestBody.get("id");
		String name = (String) requestBody.get("name");
		String location = (String) requestBody.get("location");
		
		//to do: fix association attributes
		ManageHotels ManageHotels = ManageHotelsFactory.createManageHotels(
			"SIPH.hotelmanagement.core.ManageHotelsImpl",
		id
		, name
		, location
		);
		Repository.saveObject(managehotels);
		return managehotels;
	}

    public ManageHotels createManageHotels(Map<String, Object> requestBody, int id){
		String name = (String) vmjExchange.getRequestBodyForm("name");
		String location = (String) vmjExchange.getRequestBodyForm("location");
		
		//to do: fix association attributes
		
		ManageHotels managehotels = ManageHotelsFactory.createManageHotels("SIPH.hotelmanagement.core.ManageHotelsImpl", name, location);
		return managehotels;
	}

    public HashMap<String, Object> updateManageHotels(Map<String, Object> requestBody){
		String idStr = (String) requestBody.get("");
		int id = Integer.parseInt(idStr);
		ManageHotels managehotels = Repository.getObject(id);
		
		managehotels.setName((String) requestBody.get("name"));
		managehotels.setLocation((String) requestBody.get("location"));
		
		Repository.updateObject(managehotels);
		
		//to do: fix association attributes
		
		return managehotels.toHashMap();
		
	}

    public HashMap<String, Object> getManageHotels(Map<String, Object> requestBody){
		List<HashMap<String, Object>> managehotelsList = getAllManageHotels("managehotels_impl");
		for (HashMap<String, Object> managehotels : managehotelsList){
			int record_id = ((Double) managehotels.get("record_id")).intValue();
			if (record_id == id){
				return managehotels;
			}
		}
		return null;
	}

	public HashMap<String, Object> getManageHotelsById(int id){
		String idStr = vmjExchange.getGETParam(""); 
		int id = Integer.parseInt(idStr);
		ManageHotels managehotels = managehotelsRepository.getObject(id);
		return managehotels.toHashMap();
	}

    public List<HashMap<String,Object>> getAllManageHotels(Map<String, Object> requestBody){
		String table = (String) requestBody.get("table_name");
		List<ManageHotels> List = Repository.getAllObject(table);
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<ManageHotels> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

    public List<HashMap<String,Object>> deleteManageHotels(Map<String, Object> requestBody){
		String idStr = ((String) requestBody.get("id"));
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAllManageHotels(requestBody);
	}

	public void addRoomToHotel(ManageRooms rooms) {
		// TODO: implement this method
	}
}
