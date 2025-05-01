package SIPH.payment.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class PaymentResourceComponent implements IPaymentResource{
	
	public PaymentResourceComponent() { }
 
    public abstract IPayment createIPayment(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> updateIPayment(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> getIPayment(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAllIPayment(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> deleteIPayment(VMJExchange vmjExchange);

	public abstract void processPayment();
}
