package SIPH.auth.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Authentication {
	public User getUser();
	public void setUser(User user);
	public void login(String email, String password);
	public void register(String name, String email, String phoneNumber, String password);
	HashMap<String, Object> toHashMap();
}
