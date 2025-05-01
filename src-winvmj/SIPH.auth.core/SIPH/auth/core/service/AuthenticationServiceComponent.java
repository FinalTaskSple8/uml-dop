package SIPH.auth.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class AuthenticationServiceComponent implements AuthenticationService{
	protected RepositoryUtil<Authentication> Repository;

    public AuthenticationServiceComponent(){
        this.Repository = new RepositoryUtil<Authentication>(SIPH.auth.core.AuthenticationComponent.class);
    }	

    public abstract List<HashMap<String,Object>> saveAuthentication(VMJExchange vmjExchange);
    public abstract Authentication createAuthentication(Map<String, Object> requestBodye);
	public abstract Authentication createAuthentication(Map<String, Object> requestBody, Map<String, Object> response);    
	public abstract HashMap<String, Object> updateAuthentication(Map<String, Object> requestBody);
    public abstract HashMap<String, Object> getAuthentication(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> getAllAuthentication(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> transformListToHashMap(List<Authentication> List);
    public abstract List<HashMap<String,Object>> deleteAuthentication(Map<String, Object> requestBody);
	public abstract HashMap<String, Object> getAuthenticationById(int id);

	public abstract void login(String email, String password);

	public abstract void register(String name, String email, String phoneNumber, String password);
}
