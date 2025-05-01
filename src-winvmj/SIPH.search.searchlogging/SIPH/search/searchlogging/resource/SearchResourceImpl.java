package SIPH.search.searchlogging;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import SIPH.search.core.SearchResourceDecorator;
import SIPH.search.core.SearchImpl;
import SIPH.search.core.SearchResourceComponent;

public class SearchResourceImpl extends SearchResourceDecorator {
    public SearchResourceImpl (SearchResourceComponent record) {
        super(record);
    }

    // @Restriced(permission = "")
    @Route(url="call/searchlogging/save")
    public List<HashMap<String,Object>> save(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		  = create(vmjExchange);
		Repository.saveObject();
		return getAll(vmjExchange);
	}

    public Search create(VMJExchange vmjExchange){
		
		  = record.create(vmjExchange);
		 deco = Factory.create("SIPH.searchlogging.core.SearchImpl", , );
			return deco;
	}

    public Search create(VMJExchange vmjExchange, int id){
		  = Repository.getObject(id);
		int recordId = (((Decorator) saved.getRecord()).getId();
		
		  = record.create(vmjExchange);
		 deco = Factory.create("SIPH.searchlogging.core.SearchImpl", id, , );
			return deco;
	}

    // @Restriced(permission = "")
    @Route(url="call/searchlogging/update")
    public HashMap<String, Object> update(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		String idStr = (String) vmjExchange.getRequestBodyForm("");
		int id = Integer.parseInt(idStr);
		
		  = Repository.getObject(id);
		 = create(vmjExchange, id);
		
		Repository.updateObject();
		 = Repository.getObject(id);
		//to do: fix association attributes
		
		return .toHashMap();
		
	}

	// @Restriced(permission = "")
    @Route(url="call/searchlogging/detail")
    public HashMap<String, Object> get(VMJExchange vmjExchange){
		return record.getSearch(vmjExchange);
	}

	// @Restriced(permission = "")
    @Route(url="call/searchlogging/list")
    public List<HashMap<String,Object>> getAll(VMJExchange vmjExchange){
		List<> List = Repository.getAllObject("_impl");
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

	// @Restriced(permission = "")
    @Route(url="call/searchlogging/delete")
    public List<HashMap<String,Object>> deleteSearch(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		String idStr = (String) vmjExchange.getRequestBodyForm("");
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAll(vmjExchange);
	}

	public void logSearch(String query) {
		// TODO: implement this method
	}
}
