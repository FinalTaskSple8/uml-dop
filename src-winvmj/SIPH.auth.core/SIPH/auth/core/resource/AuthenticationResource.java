package SIPH.auth.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface AuthenticationResource {
    List<HashMap<String,Object>> saveAuthentication(VMJExchange vmjExchange);
    HashMap<String, Object> updateAuthentication(VMJExchange vmjExchange);
    HashMap<String, Object> getAuthentication(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllAuthentication(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteAuthentication(VMJExchange vmjExchange);
	HashMap<String, Object> createAuthentication(VMJExchange vmjExhange);
}
