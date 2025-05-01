package SIPH.roommanagement.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface ManageRooms {
	public int getHotelId();
	public void setHotelId(int hotelId);
	public int getNumber();
	public void setNumber(int number);
	public String getType();
	public void setType(String type);
	public int getPrice();
	public void setPrice(int price);
	public boolean getIsAvailable();
	public void setIsAvailable(boolean isAvailable);
	public ManageHotelsImpl getManagehotelsimpl();
	public void setManagehotelsimpl(ManageHotelsImpl managehotelsimpl);
	HashMap<String, Object> toHashMap();
}
