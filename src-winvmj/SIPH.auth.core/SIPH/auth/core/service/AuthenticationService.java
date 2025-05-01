package SIPH.auth.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface AuthenticationService {
	Authentication createAuthentication(Map<String, Object> requestBody);
	Authentication createAuthentication(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getAuthentication(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveAuthentication(Map<String, Object> requestBody);
    HashMap<String, Object> updateAuthentication(Map<String, Object> requestBody);
    HashMap<String, Object> getAuthenticationById(int id);
    List<HashMap<String,Object>> getAllAuthentication(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteAuthentication(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
