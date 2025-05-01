package SIPH.auth.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class AuthenticationServiceDecorator extends AuthenticationServiceComponent{
	protected AuthenticationServiceComponent record;

    public AuthenticationServiceDecorator(AuthenticationServiceComponent record) {
        this.record = record;
    }

	public AuthenticationImpl createAuthentication(Map<String, Object> requestBody){
		return record.createAuthentication(requestBody);
	}

    public Authentication createAuthentication(Map<String, Object> requestBody, Map<String, Object> response){
		return record.createAuthentication(requestBody, response);
	}

	public HashMap<String, Object> getAuthentication(Map<String, Object> requestBody){
		return record.getAuthentication(requestBody);
	}

	public List<HashMap<String,Object>> getAllAuthentication(Map<String, Object> requestBody){
		return record.getAllAuthentication(requestBody);
	}

    public List<HashMap<String,Object>> saveAuthentication(VMJExchange vmjExchange){
		return record.saveAuthentication(vmjExchange);
	}

    public HashMap<String, Object> updateAuthentication(Map<String, Object> requestBody){
		return record.updateAuthentication(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<Authentication> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> deleteAuthentication(Map<String, Object> requestBody){
		return record.deleteAuthentication(requestBody);
	}

	public HashMap<String, Object> getAuthenticationById(int id){
        return record.getAuthenticationById(id);
    }

	public void login(String email, String password) {
		return record.login(email, password);
	}

	public void register(String name, String email, String phoneNumber, String password) {
		return record.register(name, email, phoneNumber, password);
	}
}
