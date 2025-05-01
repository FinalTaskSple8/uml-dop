package SIPH.hotelmanagement.core;

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


@Entity(name="managehotels_impl")
@Table(name="managehotels_impl")
public class ManageHotelsImpl extends ManageHotelsComponent {

	public ManageHotelsImpl(String id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public ManageHotelsImpl(String name, String location) {
		this. =  .randomUUID();;
		this.name = name;
		this.location = location;
	}

	public ManageHotelsImpl() { }

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void addRoomToHotel(ManageRooms rooms) {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> managehotelsMap = new HashMap<String,Object>();
		managehotelsMap.put("id",getId());
		managehotelsMap.put("name",getName());
		managehotelsMap.put("location",getLocation());

        return managehotelsMap;
    }

}
