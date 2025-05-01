package SIPH.roommanagement.core;

import java.lang.Math;
import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name="managerooms_impl")
@Table(name="managerooms_impl")
public class ManageRoomsImpl extends ManageRoomsComponent {

	public ManageRoomsImpl(int hotelId, int number, String type, int price, boolean isAvailable, ManageHotelsImpl managehotelsimpl) {
		this.hotelId = hotelId;
		this.number = number;
		this.type = type;
		this.price = price;
		this.isAvailable = isAvailable;
		this.managehotelsimpl = managehotelsimpl;
	}

	public ManageRoomsImpl(int hotelId, int number, String type, int price, boolean isAvailable, ManageHotelsImpl managehotelsimpl) {
		this.hotelId =  hotelId.randomUUID();;
		this.hotelId = hotelId;
		this.number = number;
		this.type = type;
		this.price = price;
		this.isAvailable = isAvailable;
		this.managehotelsimpl = managehotelsimpl;
	}

	public ManageRoomsImpl() { }

	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public EByteArray getRoomByHotelId() {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> manageroomsMap = new HashMap<String,Object>();
		manageroomsMap.put("hotelId",getHotelId());
		manageroomsMap.put("number",getNumber());
		manageroomsMap.put("type",getType());
		manageroomsMap.put("price",getPrice());
		manageroomsMap.put("isAvailable",getIsAvailable());
		manageroomsMap.put("managehotelsimpl",getManagehotelsimpl());

        return manageroomsMap;
    }

}
