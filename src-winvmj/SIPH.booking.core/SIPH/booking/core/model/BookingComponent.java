package SIPH.booking.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="booking_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BookingComponent implements Booking{
	@Id
	protected int bookingId; protected int userId; protected int hotelId; 
	protected int bookingId;
	protected int userId;
	protected int hotelId;
	protected EDate checkInDate;
	protected EDate checkOutDate;
	protected EDate numberOfGuests;
	protected EDate totalPrice;
	protected String status;
	protected String objectName = BookingComponent.class.getName();

	public BookingComponent() {

	} 

	public BookingComponent(
        int bookingId, int userId, int hotelId, EDate checkInDate, EDate checkOutDate, EDate numberOfGuests, EDate totalPrice, String status
    ) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.hotelId = hotelId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
        this.totalPrice = totalPrice;
        this.status = status;
    }

	public int getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public EDate getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(EDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public EDate getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(EDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public EDate getNumberOfGuests() {
		return this.numberOfGuests;
	}

	public void setNumberOfGuests(EDate numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	public EDate getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(EDate totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
 
	public abstract void createBooking();

	public abstract void cancelBooking();

	public abstract Real calculateTotalPrice();

	public abstract String viewBookingDetails();

	@Override
    public String toString() {
        return "{" +
            " bookingId='" + getBookingId() + "'" +
            " userId='" + getUserId() + "'" +
            " hotelId='" + getHotelId() + "'" +
            " checkInDate='" + getCheckInDate() + "'" +
            " checkOutDate='" + getCheckOutDate() + "'" +
            " numberOfGuests='" + getNumberOfGuests() + "'" +
            " totalPrice='" + getTotalPrice() + "'" +
            " status='" + getStatus() + "'" +
            "}";
    }
	
}
