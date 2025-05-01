package SIPH.search.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface SearchService {
	Search createSearch(Map<String, Object> requestBody);
	Search createSearch(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getSearch(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveSearch(Map<String, Object> requestBody);
    HashMap<String, Object> updateSearch(Map<String, Object> requestBody);
    HashMap<String, Object> getSearchById(int id);
    List<HashMap<String,Object>> getAllSearch(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteSearch(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
