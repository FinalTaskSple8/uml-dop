package SIPH.hotelmanagement.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="managehotels_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ManageHotelsComponent implements ManageHotels{
	@Id
	
	protected String name;
	protected String location;
	protected String objectName = ManageHotelsComponent.class.getName();

	public ManageHotelsComponent() {

	} 

	public ManageHotelsComponent(
        String id, String name, String location
    ) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

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
 
	public abstract void addRoomToHotel(ManageRooms rooms);

	@Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            " name='" + getName() + "'" +
            " location='" + getLocation() + "'" +
            "}";
    }
	
}
