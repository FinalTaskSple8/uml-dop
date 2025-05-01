package SIPH.auth.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.auth.AuthenticationFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class AuthenticationResourceImpl extends AuthenticationResourceComponent{
	
	private AuthenticationServiceImpl authenticationServiceImpl = new AuthenticationServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/auth")
    public HashMap<String,Object> createauthentication(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			Authentication result = authenticationServiceImpl.createAuthentication(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/auth/update")
    public HashMap<String, Object> updateAuthentication(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return authenticationServiceImpl.updateAuthentication(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/auth/detail")
    public HashMap<String, Object> getAuthentication(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return authenticationServiceImpl.getAuthentication(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/auth/list")
    public List<HashMap<String,Object>> getAllAuthentication(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return authenticationServiceImpl.getAllAuthentication(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/auth/delete")
    public List<HashMap<String,Object>> deleteAuthentication(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return authenticationServiceImpl.deleteAuthentication(requestBody);
	}

	public void login(String email, String password) {
		// TODO: implement this method
	}

	public void register(String name, String email, String phoneNumber, String password) {
		// TODO: implement this method
	}
}
