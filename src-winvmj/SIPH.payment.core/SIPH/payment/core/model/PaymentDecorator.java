package SIPH.payment.core;

import java.lang.Math;
import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name="ipayment_impl")
@Table(name="ipayment_impl")
public class PaymentDecorator extends PaymentDecorator {

	public PaymentDecorator() {
	}

	public PaymentDecorator() {
		this. =  .randomUUID();;
	}

	public PaymentDecorator() { }


	public void processPayment() {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> ipaymentMap = new HashMap<String,Object>();

        return ipaymentMap;
    }

}
