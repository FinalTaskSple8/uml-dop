package SIPH.search.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Search {
	public ManageHotels getHotels();
	public void setHotels(ManageHotels hotels);
	private ManageHotels searchHotels(String query);
	HashMap<String, Object> toHashMap();
}
