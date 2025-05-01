package SIPH.search.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

public abstract class SearchResourceDecorator extends SearchResourceComponent{
	protected SearchResourceComponent record;

    public SearchResourceDecorator(SearchResourceComponent record) {
        this.record = record;
    }

    public  create(VMJExchange vmjExchange){
		return record.create(vmjExchange);
	}

    public HashMap<String, Object> update(VMJExchange vmjExchange){
		return record.update(vmjExchange);
	}

    public HashMap<String, Object> get(VMJExchange vmjExchange){
		return record.get(vmjExchange);
	}

    public List<HashMap<String,Object>> getAll(VMJExchange vmjExchange){
		return record.getAll(vmjExchange);
	}

    public List<HashMap<String,Object>> delete(VMJExchange vmjExchange){
		return record.delete(vmjExchange);
	}

	protected ManageHotels searchHotels(String query) {
		return record.searchHotels(query);
	}
}
