package SIPH.booking.earlycheckinout;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import SIPH.booking.core.BookingDecorator;
import SIPH.booking.core.Booking;
import SIPH.booking.core.BookingComponent;

@Entity(name="booking_earlycheckinout")
@Table(name="booking_earlycheckinout")
public class BookingImpl extends BookingDecorator {

	public boolean earlyCheckIn;
	public boolean lateCheckOut;
	public Real earlyCheckInFee;
	public Real lateCheckOutFee;
	public BookingImpl(
        super();
        this.objectName = BookingImpl.class.getName();
    }
    
    public BookingImpl(boolean earlyCheckIn, boolean lateCheckOut, Real earlyCheckInFee, Real lateCheckOutFee) {
    	super();
		this.earlyCheckIn = earlyCheckIn;
		this.lateCheckOut = lateCheckOut;
		this.earlyCheckInFee = earlyCheckInFee;
		this.lateCheckOutFee = lateCheckOutFee;
		this.objectName = BookingImpl.class.getName();
    }
	
	public BookingImpl(BookingComponent record, boolean earlyCheckIn, boolean lateCheckOut, Real earlyCheckInFee, Real lateCheckOutFee) {
		super(record);
		this.earlyCheckIn = earlyCheckIn;
		this.lateCheckOut = lateCheckOut;
		this.earlyCheckInFee = earlyCheckInFee;
		this.lateCheckOutFee = lateCheckOutFee;
		this.objectName = BookingImpl.class.getName();
	}


	public void requestEarlyCheckIn(Real fee) {
		// TODO: implement this method
	}

	public void requestLateCheckOut(Real fee) {
		// TODO: implement this method
	}

	public Real calculateTotalPrice() {
		// TODO: implement this method
	}

}
