package SIPH.payment.onlinepayment;

import java.util.*;

import vmj.routing.route.VMJExchange;

import SIPH.payment.core.PaymentServiceDecorator;
import SIPH.payment.core.PaymentImpl;
import SIPH.payment.core.PaymentServiceComponent;

public class PaymentServiceImpl extends PaymentServiceDecorator {
    public PaymentServiceImpl (PaymentServiceComponent record) {
        super(record);
    }

    
	public void processPayment() {
		// TODO: implement this method
	}

	public void authenticate() {
		// TODO: implement this method
	}
}
