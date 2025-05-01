package SIPH.payment.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.payment.PaymentComponent;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class PaymentComponent extends PaymentComponent{
	
	private PaymentComponent ipaymentServiceImpl = new PaymentComponent();

	// @Restriced(permission = "")
    @Route(url="call/payment")
    public HashMap<String,Object> createipayment(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			IPayment result = ipaymentServiceImpl.createIPayment(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/payment/update")
    public HashMap<String, Object> updateIPayment(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return ipaymentServiceImpl.updateIPayment(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/payment/detail")
    public HashMap<String, Object> getIPayment(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return ipaymentServiceImpl.getIPayment(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/payment/list")
    public List<HashMap<String,Object>> getAllIPayment(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return ipaymentServiceImpl.getAllIPayment(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/payment/delete")
    public List<HashMap<String,Object>> deleteIPayment(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return ipaymentServiceImpl.deleteIPayment(requestBody);
	}

	public void processPayment() {
		// TODO: implement this method
	}
}
