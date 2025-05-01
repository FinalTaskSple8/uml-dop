package SIPH.payment.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface IPaymentService {
	IPayment createIPayment(Map<String, Object> requestBody);
	IPayment createIPayment(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getIPayment(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveIPayment(Map<String, Object> requestBody);
    HashMap<String, Object> updateIPayment(Map<String, Object> requestBody);
    HashMap<String, Object> getIPaymentById(int id);
    List<HashMap<String,Object>> getAllIPayment(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteIPayment(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
