package SIPH.payment.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ipayment_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PaymentComponent implements IPayment{
	@Id
	
	protected String objectName = PaymentComponent.class.getName();

	public PaymentComponent() {

	} 

	public PaymentComponent(
        
    ) {
    }

 
	public abstract void processPayment();

	@Override
    public String toString() {
        return "{" +
            "}";
    }
	
}
