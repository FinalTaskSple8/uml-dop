package SIPH.payment.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

public abstract class PaymentResourceDecorator extends PaymentResourceComponent{
	protected PaymentResourceComponent record;

    public PaymentResourceDecorator(PaymentResourceComponent record) {
        this.record = record;
    }

    public IPayment createIPayment(VMJExchange vmjExchange){
		return record.createIPayment(vmjExchange);
	}

    public HashMap<String, Object> updateIPayment(VMJExchange vmjExchange){
		return record.updateIPayment(vmjExchange);
	}

    public HashMap<String, Object> getIPayment(VMJExchange vmjExchange){
		return record.getIPayment(vmjExchange);
	}

    public List<HashMap<String,Object>> getAllIPayment(VMJExchange vmjExchange){
		return record.getAllIPayment(vmjExchange);
	}

    public List<HashMap<String,Object>> deleteIPayment(VMJExchange vmjExchange){
		return record.deleteIPayment(vmjExchange);
	}

	public void processPayment() {
		return record.processPayment();
	}
}
