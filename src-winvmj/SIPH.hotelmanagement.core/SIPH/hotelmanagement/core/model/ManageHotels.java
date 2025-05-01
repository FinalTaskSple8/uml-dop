package SIPH.hotelmanagement.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface ManageHotels {
	public String getId();
	public void setId(String id);
	public String getName();
	public void setName(String name);
	public String getLocation();
	public void setLocation(String location);
	HashMap<String, Object> toHashMap();
}
