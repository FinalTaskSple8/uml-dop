package SIPH.search.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class SearchServiceDecorator extends SearchServiceComponent{
	protected SearchServiceComponent record;

    public SearchServiceDecorator(SearchServiceComponent record) {
        this.record = record;
    }

	public SearchImpl create(Map<String, Object> requestBody){
		return record.create(requestBody);
	}

    public  create(Map<String, Object> requestBody, Map<String, Object> response){
		return record.create(requestBody, response);
	}

	public HashMap<String, Object> get(Map<String, Object> requestBody){
		return record.get(requestBody);
	}

	public List<HashMap<String,Object>> getAll(Map<String, Object> requestBody){
		return record.getAll(requestBody);
	}

    public List<HashMap<String,Object>> save(VMJExchange vmjExchange){
		return record.save(vmjExchange);
	}

    public HashMap<String, Object> update(Map<String, Object> requestBody){
		return record.update(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> delete(Map<String, Object> requestBody){
		return record.delete(requestBody);
	}

	public HashMap<String, Object> getById(int id){
        return record.getById(id);
    }

	protected ManageHotels searchHotels(String query) {
		return record.searchHotels(query);
	}
}
