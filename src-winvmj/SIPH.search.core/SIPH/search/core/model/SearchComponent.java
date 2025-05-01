package SIPH.search.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class SearchComponent implements {
	@Id
	
	public ManageHotels hotels;
	protected String objectName = SearchComponent.class.getName();

	public SearchComponent() {

	} 

	public SearchComponent(
        ManageHotels hotels
    ) {
        this.hotels = hotels;
    }

	public abstract ManageHotels getHotels();
	public abstract void setHotels(ManageHotels hotels);
	
 
	protected abstract ManageHotels searchHotels(String query);

	@Override
    public String toString() {
        return "{" +
            " hotels='" + getHotels() + "'" +
            "}";
    }
	
}
