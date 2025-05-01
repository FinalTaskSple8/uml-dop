package SIPH.payment.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface IPaymentResource {
    List<HashMap<String,Object>> saveIPayment(VMJExchange vmjExchange);
    HashMap<String, Object> updateIPayment(VMJExchange vmjExchange);
    HashMap<String, Object> getIPayment(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllIPayment(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteIPayment(VMJExchange vmjExchange);
	HashMap<String, Object> createIPayment(VMJExchange vmjExhange);
}
