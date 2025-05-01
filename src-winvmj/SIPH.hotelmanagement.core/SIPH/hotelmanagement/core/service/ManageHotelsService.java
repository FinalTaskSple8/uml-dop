package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface ManageHotelsService {
	ManageHotels createManageHotels(Map<String, Object> requestBody);
	ManageHotels createManageHotels(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getManageHotels(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveManageHotels(Map<String, Object> requestBody);
    HashMap<String, Object> updateManageHotels(Map<String, Object> requestBody);
    HashMap<String, Object> getManageHotelsById(int id);
    List<HashMap<String,Object>> getAllManageHotels(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteManageHotels(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
