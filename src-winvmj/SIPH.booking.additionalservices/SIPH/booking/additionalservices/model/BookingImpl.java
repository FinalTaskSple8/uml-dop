package SIPH.booking.additionalservices;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import SIPH.booking.core.BookingDecorator;
import SIPH.booking.core.Booking;
import SIPH.booking.core.BookingComponent;

@Entity(name="booking_additionalservices")
@Table(name="booking_additionalservices")
public class BookingImpl extends BookingDecorator {

	public EEList additionalServices;
	public Real servicesCost;
	public BookingImpl(
        super();
        this.objectName = BookingImpl.class.getName();
    }
    
    public BookingImpl(EEList additionalServices, Real servicesCost) {
    	super();
		this.additionalServices = additionalServices;
		this.servicesCost = servicesCost;
		this.objectName = BookingImpl.class.getName();
    }
	
	public BookingImpl(BookingComponent record, EEList additionalServices, Real servicesCost) {
		super(record);
		this.additionalServices = additionalServices;
		this.servicesCost = servicesCost;
		this.objectName = BookingImpl.class.getName();
	}


	public void addService(String serviceName, Real serviceCost) {
		// TODO: implement this method
	}

	public Real calculateTotalPrice() {
		// TODO: implement this method
	}

}
