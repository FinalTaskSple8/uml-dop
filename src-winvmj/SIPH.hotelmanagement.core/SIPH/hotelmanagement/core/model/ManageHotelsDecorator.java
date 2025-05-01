package SIPH.hotelmanagement.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class ManageHotelsDecorator extends ManageHotelsComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected ManageHotelsComponent record;

	public ManageHotelsDecorator () {
		super();
		this.record = record;
		this. =  .randomUUID();
		
	public ManageHotelsDecorator (ManageHotelsComponent record) {
		this. =  .randomUUID();
		this.record = record;
	}

	public ManageHotelsDecorator (, ManageHotelsComponent record) {
		this. =  ;
		this.record = record;
	}
	
	public ManageHotelsDecorator (ManageHotelsComponent record, String objectName) {
		this. =  .randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public ManageHotelsDecorator() { }

	public String getId() {
		return record.getId();
	}
	public void setId(String id) {
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

	public void addRoomToHotel(ManageRooms rooms) {
		return record.addRoomToHotel(rooms);
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
