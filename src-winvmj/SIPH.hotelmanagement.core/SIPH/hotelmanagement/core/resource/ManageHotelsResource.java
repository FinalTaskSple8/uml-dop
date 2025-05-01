package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface ManageHotelsResource {
    List<HashMap<String,Object>> saveManageHotels(VMJExchange vmjExchange);
    HashMap<String, Object> updateManageHotels(VMJExchange vmjExchange);
    HashMap<String, Object> getManageHotels(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllManageHotels(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteManageHotels(VMJExchange vmjExchange);
	HashMap<String, Object> createManageHotels(VMJExchange vmjExhange);
}
