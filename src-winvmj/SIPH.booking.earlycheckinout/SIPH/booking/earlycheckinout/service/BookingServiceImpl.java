package SIPH.booking.earlycheckinout;

import java.util.*;

import vmj.routing.route.VMJExchange;

import SIPH.booking.core.BookingServiceDecorator;
import SIPH.booking.core.BookingImpl;
import SIPH.booking.core.BookingServiceComponent;

public class BookingServiceImpl extends BookingServiceDecorator {
    public BookingServiceImpl (BookingServiceComponent record) {
        super(record);
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
