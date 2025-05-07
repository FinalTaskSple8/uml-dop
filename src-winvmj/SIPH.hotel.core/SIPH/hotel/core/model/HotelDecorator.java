package SIPH.hotel.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class HotelDecorator extends HotelComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected HotelComponent record;

	public HotelDecorator () {
		super();
		this.record = record;
		this.id =  id.randomUUID();
		
	public HotelDecorator (HotelComponent record) {
		this.id =  id.randomUUID();
		this.record = record;
	}

	public HotelDecorator (UUID id, HotelComponent record) {
		this.id =  id;
		this.record = record;
	}
	
	public HotelDecorator (HotelComponent record, String objectName) {
		this.id =  id.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public HotelDecorator() { }

	public UUID getId() {
		return record.getId();
	}
	public void setId(UUID id) {
		record.setId(id);
	}
	public String getName() {
		return record.getName();
	}
	public void setName(String name) {
		record.setName(name);
	}
	public String getLocation() {
		return record.getLocation();
	}
	public void setLocation(String location) {
		record.setLocation(location);
	}
	public int getPrice() {
		return record.getPrice();
	}
	public void setPrice(int price) {
		record.setPrice(price);
	}

	public void addRoomToHotel(Room rooms) {
		return record.addRoomToHotel(rooms);
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
