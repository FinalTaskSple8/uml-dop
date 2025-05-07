package SIPH.booking.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Booking {
	public UUID getUserId();
	public void setUserId(UUID userId);
	public EDate getCheckInDate();
	public void setCheckInDate(EDate checkInDate);
	public EDate getCheckOutDate();
	public void setCheckOutDate(EDate checkOutDate);
	public int getNumberOfGuests();
	public void setNumberOfGuests(int numberOfGuests);
	public Real getTotalPrice();
	public void setTotalPrice(Real totalPrice);
	public String getStatus();
	public void setStatus(String status);
	public UUID getRoomId();
	public void setRoomId(UUID roomId);
	public UUID getPaymentId();
	public void setPaymentId(UUID paymentId);
	public RoomImpl getRoomimpl();
	public void setRoomimpl(RoomImpl roomimpl);
	public UUID getId();
	public void setId(UUID id);
	HashMap<String, Object> toHashMap();
}
