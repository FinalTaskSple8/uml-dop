package SIPH.booking.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Booking {
	public int getBookingId();
	public void setBookingId(int bookingId);
	public int getUserId();
	public void setUserId(int userId);
	public int getHotelId();
	public void setHotelId(int hotelId);
	public EDate getCheckInDate();
	public void setCheckInDate(EDate checkInDate);
	public EDate getCheckOutDate();
	public void setCheckOutDate(EDate checkOutDate);
	public EDate getNumberOfGuests();
	public void setNumberOfGuests(EDate numberOfGuests);
	public EDate getTotalPrice();
	public void setTotalPrice(EDate totalPrice);
	public String getStatus();
	public void setStatus(String status);
	HashMap<String, Object> toHashMap();
}
