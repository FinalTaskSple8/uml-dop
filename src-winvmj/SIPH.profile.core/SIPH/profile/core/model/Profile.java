package SIPH.profile.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Profile {
	public int getUserId();
	public void setUserId(int userId);
	public String getName();
	public void setName(String name);
	public String getEmail();
	public void setEmail(String email);
	public String getPhoneNum();
	public void setPhoneNum(String phoneNum);
	public User getUser();
	public void setUser(User user);
	public User getUser();
	public void setUser(User user);
	public String showProfile(int userId);
	public boolean editProfile(int userId, String name, String email, String phoneNum);
	HashMap<String, Object> toHashMap();
}
