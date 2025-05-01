package SIPH.booking.roomupgrade;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import SIPH.booking.core.BookingDecorator;
import SIPH.booking.core.Booking;
import SIPH.booking.core.BookingComponent;

@Entity(name="booking_roomupgrade")
@Table(name="booking_roomupgrade")
public class BookingImpl extends BookingDecorator {

	public String upgradedRoomType;
	public Real upgradeCost;
	public BookingImpl(
        super();
        this.objectName = BookingImpl.class.getName();
    }
    
    public BookingImpl(String upgradedRoomType, Real upgradeCost) {
    	super();
		this.upgradedRoomType = upgradedRoomType;
		this.upgradeCost = upgradeCost;
		this.objectName = BookingImpl.class.getName();
    }
	
	public BookingImpl(BookingComponent record, String upgradedRoomType, Real upgradeCost) {
		super(record);
		this.upgradedRoomType = upgradedRoomType;
		this.upgradeCost = upgradeCost;
		this.objectName = BookingImpl.class.getName();
	}


	public void requestRoomUpgrade(String newRoomType, Real additionalCost) {
		// TODO: implement this method
	}

	public void calculateTotalPrice() {
		// TODO: implement this method
	}

}
