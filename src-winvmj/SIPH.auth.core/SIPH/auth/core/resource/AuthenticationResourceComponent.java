package SIPH.auth.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class AuthenticationResourceComponent implements AuthenticationResource{
	
	public AuthenticationResourceComponent() { }
 
    public abstract Authentication createAuthentication(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> updateAuthentication(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> getAuthentication(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAllAuthentication(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> deleteAuthentication(VMJExchange vmjExchange);

	public abstract void login(String email, String password);

	public abstract void register(String name, String email, String phoneNumber, String password);
}
