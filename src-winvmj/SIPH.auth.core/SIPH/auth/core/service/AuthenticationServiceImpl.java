package SIPH.auth.core;
import java.util.*;
import com.google.gson.Gson;
import java.util.*;
import java.util.logging.Logger;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.auth.AuthenticationFactory;
import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class AuthenticationServiceImpl extends AuthenticationServiceComponent{

    public List<HashMap<String,Object>> saveAuthentication(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		Authentication authentication = createAuthentication(vmjExchange);
		authenticationRepository.saveObject(authentication);
		return getAllAuthentication(vmjExchange);
	}

    public Authentication createAuthentication(Map<String, Object> requestBody){
		
		//to do: fix association attributes
		Authentication Authentication = AuthenticationFactory.createAuthentication(
			"SIPH.auth.core.AuthenticationImpl",
		user
		);
		Repository.saveObject(authentication);
		return authentication;
	}

    public Authentication createAuthentication(Map<String, Object> requestBody, int id){
		
		//to do: fix association attributes
		
		Authentication authentication = AuthenticationFactory.createAuthentication("SIPH.auth.core.AuthenticationImpl", user);
		return authentication;
	}

    public HashMap<String, Object> updateAuthentication(Map<String, Object> requestBody){
		String idStr = (String) requestBody.get("");
		int id = Integer.parseInt(idStr);
		Authentication authentication = Repository.getObject(id);
		
		
		Repository.updateObject(authentication);
		
		//to do: fix association attributes
		
		return authentication.toHashMap();
		
	}

    public HashMap<String, Object> getAuthentication(Map<String, Object> requestBody){
		List<HashMap<String, Object>> authenticationList = getAllAuthentication("authentication_impl");
		for (HashMap<String, Object> authentication : authenticationList){
			int record_id = ((Double) authentication.get("record_id")).intValue();
			if (record_id == id){
				return authentication;
			}
		}
		return null;
	}

	public HashMap<String, Object> getAuthenticationById(int id){
		String idStr = vmjExchange.getGETParam(""); 
		int id = Integer.parseInt(idStr);
		Authentication authentication = authenticationRepository.getObject(id);
		return authentication.toHashMap();
	}

    public List<HashMap<String,Object>> getAllAuthentication(Map<String, Object> requestBody){
		String table = (String) requestBody.get("table_name");
		List<Authentication> List = Repository.getAllObject(table);
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<Authentication> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

    public List<HashMap<String,Object>> deleteAuthentication(Map<String, Object> requestBody){
		String idStr = ((String) requestBody.get("id"));
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAllAuthentication(requestBody);
	}

	public void login(String email, String password) {
		// TODO: implement this method
	}

	public void register(String name, String email, String phoneNumber, String password) {
		// TODO: implement this method
	}
}
