package SIPH.profile.points;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import SIPH.profile.core.ProfileResourceDecorator;
import SIPH.profile.core.ProfileImpl;
import SIPH.profile.core.ProfileResourceComponent;

public class ProfileResourceImpl extends ProfileResourceDecorator {
    public ProfileResourceImpl (ProfileResourceComponent record) {
        super(record);
    }

    // @Restriced(permission = "")
    @Route(url="call/points/save")
    public List<HashMap<String,Object>> save(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		  = create(vmjExchange);
		Repository.saveObject();
		return getAll(vmjExchange);
	}

    public Profile create(VMJExchange vmjExchange){
		String pointStr = (String) vmjExchange.getRequestBodyForm("point");
		int point = Integer.parseInt(pointStr);
		String milestoneLevel = (String) vmjExchange.getRequestBodyForm("milestoneLevel");
		
		  = record.create(vmjExchange);
		 deco = Factory.create("SIPH.points.core.ProfileImpl", , point, milestoneLevel);
			return deco;
	}

    public Profile create(VMJExchange vmjExchange, int id){
		String pointStr = (String) vmjExchange.getRequestBodyForm("point");
		int point = Integer.parseInt(pointStr);
		String milestoneLevel = (String) vmjExchange.getRequestBodyForm("milestoneLevel");
		  = Repository.getObject(id);
		int recordId = (((Decorator) saved.getRecord()).getId();
		
		  = record.create(vmjExchange);
		 deco = Factory.create("SIPH.points.core.ProfileImpl", id, , point, milestoneLevel);
			return deco;
	}

    // @Restriced(permission = "")
    @Route(url="call/points/update")
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
    @Route(url="call/points/detail")
    public HashMap<String, Object> get(VMJExchange vmjExchange){
		return record.getProfile(vmjExchange);
	}

	// @Restriced(permission = "")
    @Route(url="call/points/list")
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
    @Route(url="call/points/delete")
    public List<HashMap<String,Object>> deleteProfile(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		String idStr = (String) vmjExchange.getRequestBodyForm("");
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAll(vmjExchange);
	}



}
