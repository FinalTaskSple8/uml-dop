package SIPH.booking.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class BookingDecorator extends BookingComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected BookingComponent record;

	public BookingDecorator () {
		super();
		this.record = record;
		this.userIdroomIdpaymentIdid =  userIdroomIdpaymentIdid.randomUUID();
		
	public BookingDecorator (BookingComponent record) {
		this.userIdroomIdpaymentIdid =  userIdroomIdpaymentIdid.randomUUID();
		this.record = record;
	}

	public BookingDecorator (UUID userIdUUID roomIdUUID paymentIdUUID id, BookingComponent record) {
		this.userIdroomIdpaymentIdid =  userIdroomIdpaymentIdid;
		this.record = record;
	}
	
	public BookingDecorator (BookingComponent record, String objectName) {
		this.userIdroomIdpaymentIdid =  userIdroomIdpaymentIdid.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public BookingDecorator() { }

	public UUID getUserId() {
		return record.getUserId();
	}
	public void setUserId(UUID userId) {
		record.setUserId(userId);
	}
	public EDate getCheckInDate() {
		return record.getCheckInDate();
	}
	public void setCheckInDate(EDate checkInDate) {
		record.setCheckInDate(checkInDate);
	}
	public EDate getCheckOutDate() {
		return record.getCheckOutDate();
	}
	public void setCheckOutDate(EDate checkOutDate) {
		record.setCheckOutDate(checkOutDate);
	}
	public int getNumberOfGuests() {
		return record.getNumberOfGuests();
	}
	public void setNumberOfGuests(int numberOfGuests) {
		record.setNumberOfGuests(numberOfGuests);
	}
	public Real getTotalPrice() {
		return record.getTotalPrice();
	}
	public void setTotalPrice(Real totalPrice) {
		record.setTotalPrice(totalPrice);
	}
	public String getStatus() {
		return record.getStatus();
	}
	public void setStatus(String status) {
		record.setStatus(status);
	}
	public UUID getRoomId() {
		return record.getRoomId();
	}
	public void setRoomId(UUID roomId) {
		record.setRoomId(roomId);
	}
	public UUID getPaymentId() {
		return record.getPaymentId();
	}
	public void setPaymentId(UUID paymentId) {
		record.setPaymentId(paymentId);
	}
	public UUID getId() {
		return record.getId();
	}
	public void setId(UUID id) {
		record.setId(id);
	}

	public void cancelBooking() {
		return record.cancelBooking();
	}

	public Real calculateTotalPrice() {
		return record.calculateTotalPrice();
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
