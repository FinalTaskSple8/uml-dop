package SIPH.payment.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class PaymentServiceComponent implements IPaymentService{
	protected RepositoryUtil<IPayment> Repository;

    public PaymentServiceComponent(){
        this.Repository = new RepositoryUtil<IPayment>(SIPH.payment.core.PaymentComponent.class);
    }	

    public abstract List<HashMap<String,Object>> saveIPayment(VMJExchange vmjExchange);
    public abstract IPayment createIPayment(Map<String, Object> requestBodye);
	public abstract IPayment createIPayment(Map<String, Object> requestBody, Map<String, Object> response);    
	public abstract HashMap<String, Object> updateIPayment(Map<String, Object> requestBody);
    public abstract HashMap<String, Object> getIPayment(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> getAllIPayment(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> transformListToHashMap(List<IPayment> List);
    public abstract List<HashMap<String,Object>> deleteIPayment(Map<String, Object> requestBody);
	public abstract HashMap<String, Object> getIPaymentById(int id);

	public abstract void processPayment();
}
