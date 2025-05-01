package SIPH.search.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.search.SearchFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class SearchResourceImpl extends SearchResourceComponent{
	
	private SearchServiceImpl ServiceImpl = new SearchServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/search")
    public HashMap<String,Object> create(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			 result = ServiceImpl.create(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/search/update")
    public HashMap<String, Object> update(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return ServiceImpl.update(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/search/detail")
    public HashMap<String, Object> get(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return ServiceImpl.get(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/search/list")
    public List<HashMap<String,Object>> getAll(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return ServiceImpl.getAll(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/search/delete")
    public List<HashMap<String,Object>> delete(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return ServiceImpl.delete(requestBody);
	}

	protected ManageHotels searchHotels(String query) {
		// TODO: implement this method
	}
}
