package SIPH.payment.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class PaymentServiceDecorator extends PaymentServiceComponent{
	protected PaymentServiceComponent record;

    public PaymentServiceDecorator(PaymentServiceComponent record) {
        this.record = record;
    }

	public PaymentImpl createIPayment(Map<String, Object> requestBody){
		return record.createIPayment(requestBody);
	}

    public IPayment createIPayment(Map<String, Object> requestBody, Map<String, Object> response){
		return record.createIPayment(requestBody, response);
	}

	public HashMap<String, Object> getIPayment(Map<String, Object> requestBody){
		return record.getIPayment(requestBody);
	}

	public List<HashMap<String,Object>> getAllIPayment(Map<String, Object> requestBody){
		return record.getAllIPayment(requestBody);
	}

    public List<HashMap<String,Object>> saveIPayment(VMJExchange vmjExchange){
		return record.saveIPayment(vmjExchange);
	}

    public HashMap<String, Object> updateIPayment(Map<String, Object> requestBody){
		return record.updateIPayment(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<IPayment> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> deleteIPayment(Map<String, Object> requestBody){
		return record.deleteIPayment(requestBody);
	}

	public HashMap<String, Object> getIPaymentById(int id){
        return record.getIPaymentById(id);
    }

	public void processPayment() {
		return record.processPayment();
	}
}
