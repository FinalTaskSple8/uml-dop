package SIPH.search.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class SearchResourceComponent implements Resource{
	
	public SearchResourceComponent() { }
 
    public abstract  create(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> update(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> get(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAll(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> delete(VMJExchange vmjExchange);

	protected abstract ManageHotels searchHotels(String query);
}
