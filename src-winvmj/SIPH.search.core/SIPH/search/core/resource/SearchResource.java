package SIPH.search.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface SearchResource {
    List<HashMap<String,Object>> saveSearch(VMJExchange vmjExchange);
    HashMap<String, Object> updateSearch(VMJExchange vmjExchange);
    HashMap<String, Object> getSearch(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllSearch(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteSearch(VMJExchange vmjExchange);
	HashMap<String, Object> createSearch(VMJExchange vmjExhange);
}
