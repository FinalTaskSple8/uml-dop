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
		this.bookingIduserIdhotelId =  bookingIduserIdhotelId.randomUUID();
		
	public BookingDecorator (BookingComponent record) {
		this.bookingIduserIdhotelId =  bookingIduserIdhotelId.randomUUID();
		this.record = record;
	}

	public BookingDecorator (int bookingIdint userIdint hotelId, BookingComponent record) {
		this.bookingIduserIdhotelId =  bookingIduserIdhotelId;
		this.record = record;
	}
	
	public BookingDecorator (BookingComponent record, String objectName) {
		this.bookingIduserIdhotelId =  bookingIduserIdhotelId.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public BookingDecorator() { }

	public int getBookingId() {
		return record.getBookingId();
	}
	public void setBookingId(int bookingId) {
		record.setBookingId(bookingId);
	}
	public int getUserId() {
		return record.getUserId();
	}
	public void setUserId(int userId) {
		record.setUserId(userId);
	}
	public int getHotelId() {
		return record.getHotelId();
	}
	public void setHotelId(int hotelId) {
		record.setHotelId(hotelId);
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
	public EDate getNumberOfGuests() {
		return record.getNumberOfGuests();
	}
	public void setNumberOfGuests(EDate numberOfGuests) {
		record.setNumberOfGuests(numberOfGuests);
	}
	public EDate getTotalPrice() {
		return record.getTotalPrice();
	}
	public void setTotalPrice(EDate totalPrice) {
		record.setTotalPrice(totalPrice);
	}
	public String getStatus() {
		return record.getStatus();
	}
	public void setStatus(String status) {
		record.setStatus(status);
	}

	public void createBooking() {
		return record.createBooking();
	}

	public void cancelBooking() {
		return record.cancelBooking();
	}

	public Real calculateTotalPrice() {
		return record.calculateTotalPrice();
	}

	public String viewBookingDetails() {
		return record.viewBookingDetails();
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
