package SIPH.roommanagement.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="managerooms_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ManageRoomsComponent implements ManageRooms{
	@Id
	protected int hotelId; 
	protected int hotelId;
	protected int number;
	protected String type;
	protected int price;
	protected boolean isAvailable;
	@ManyToOne(targetEntity=SIPH..core.Component.class)
	public  managehotelsimpl;
	protected String objectName = ManageRoomsComponent.class.getName();

	public ManageRoomsComponent() {

	} 

	public ManageRoomsComponent(
        int hotelId, int number, String type, int price, boolean isAvailable, ManageHotelsImpl managehotelsimpl
    ) {
        this.hotelId = hotelId;
        this.number = number;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
        this.managehotelsimpl = managehotelsimpl;
    }

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
	public abstract ManageHotelsImpl getManagehotelsimpl();
	public abstract void setManagehotelsimpl(ManageHotelsImpl managehotelsimpl);
	
 
	public abstract EByteArray getRoomByHotelId();

	@Override
    public String toString() {
        return "{" +
            " hotelId='" + getHotelId() + "'" +
            " number='" + getNumber() + "'" +
            " type='" + getType() + "'" +
            " price='" + getPrice() + "'" +
            " isAvailable='" + getIsAvailable() + "'" +
            " managehotelsimpl='" + getManagehotelsimpl() + "'" +
            "}";
    }
	
}
