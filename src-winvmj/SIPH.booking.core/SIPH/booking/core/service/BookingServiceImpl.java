package SIPH.booking.core;
import java.util.*;
import com.google.gson.Gson;
import java.util.*;
import java.util.logging.Logger;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.booking.BookingFactory;
import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class BookingServiceImpl extends BookingServiceComponent{

    public List<HashMap<String,Object>> saveBooking(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		Booking booking = createBooking(vmjExchange);
		bookingRepository.saveObject(booking);
		return getAllBooking(vmjExchange);
	}

    public Booking createBooking(Map<String, Object> requestBody){
		String bookingIdStr = (String) requestBody.get("bookingId");
		int bookingId = Integer.parseInt(bookingIdStr);
		String userIdStr = (String) requestBody.get("userId");
		int userId = Integer.parseInt(userIdStr);
		String hotelIdStr = (String) requestBody.get("hotelId");
		int hotelId = Integer.parseInt(hotelIdStr);
		String status = (String) requestBody.get("status");
		
		//to do: fix association attributes
		Booking Booking = BookingFactory.createBooking(
			"SIPH.booking.core.BookingImpl",
		bookingId
		, userId
		, hotelId
		, checkInDate
		, checkOutDate
		, numberOfGuests
		, totalPrice
		, status
		);
		Repository.saveObject(booking);
		return booking;
	}

    public Booking createBooking(Map<String, Object> requestBody, int id){
		String bookingIdStr = (String) vmjExchange.getRequestBodyForm("bookingId");
		int bookingId = Integer.parseInt(bookingIdStr);
		String userIdStr = (String) vmjExchange.getRequestBodyForm("userId");
		int userId = Integer.parseInt(userIdStr);
		String hotelIdStr = (String) vmjExchange.getRequestBodyForm("hotelId");
		int hotelId = Integer.parseInt(hotelIdStr);
		String status = (String) vmjExchange.getRequestBodyForm("status");
		
		//to do: fix association attributes
		
		Booking booking = BookingFactory.createBooking("SIPH.booking.core.BookingImpl", bookingId, userId, hotelId, checkInDate, checkOutDate, numberOfGuests, totalPrice, status);
		return booking;
	}

    public HashMap<String, Object> updateBooking(Map<String, Object> requestBody){
		String idStr = (String) requestBody.get("bookingIduserIdhotelId");
		int id = Integer.parseInt(idStr);
		Booking booking = Repository.getObject(id);
		
		String bookingIdStr = (String) requestBody.get("bookingId");
		booking.setBookingId(Integer.parseInt(bookingIdStr));
		String userIdStr = (String) requestBody.get("userId");
		booking.setUserId(Integer.parseInt(userIdStr));
		String hotelIdStr = (String) requestBody.get("hotelId");
		booking.setHotelId(Integer.parseInt(hotelIdStr));
		booking.setStatus((String) requestBody.get("status"));
		
		Repository.updateObject(booking);
		
		//to do: fix association attributes
		
		return booking.toHashMap();
		
	}

    public HashMap<String, Object> getBooking(Map<String, Object> requestBody){
		List<HashMap<String, Object>> bookingList = getAllBooking("booking_impl");
		for (HashMap<String, Object> booking : bookingList){
			int record_id = ((Double) booking.get("record_id")).intValue();
			if (record_id == id){
				return booking;
			}
		}
		return null;
	}

	public HashMap<String, Object> getBookingById(int id){
		String idStr = vmjExchange.getGETParam("bookingIduserIdhotelId"); 
		int id = Integer.parseInt(idStr);
		Booking booking = bookingRepository.getObject(id);
		return booking.toHashMap();
	}

    public List<HashMap<String,Object>> getAllBooking(Map<String, Object> requestBody){
		String table = (String) requestBody.get("table_name");
		List<Booking> List = Repository.getAllObject(table);
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<Booking> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

    public List<HashMap<String,Object>> deleteBooking(Map<String, Object> requestBody){
		String idStr = ((String) requestBody.get("id"));
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAllBooking(requestBody);
	}

	public void createBooking() {
		// TODO: implement this method
	}

	public void cancelBooking() {
		// TODO: implement this method
	}

	public Real calculateTotalPrice() {
		// TODO: implement this method
	}

	public String viewBookingDetails() {
		// TODO: implement this method
	}
}
