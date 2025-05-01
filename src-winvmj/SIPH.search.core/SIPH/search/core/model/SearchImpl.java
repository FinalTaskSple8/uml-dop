package SIPH.search.core;

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


@Entity(name="_impl")
@Table(name="_impl")
public class SearchImpl extends SearchComponent {

	public SearchImpl(ManageHotels hotels) {
		this.hotels = hotels;
	}

	public SearchImpl(ManageHotels hotels) {
		this. =  .randomUUID();;
		this.hotels = hotels;
	}

	public SearchImpl() { }


	protected ManageHotels searchHotels(String query) {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> Map = new HashMap<String,Object>();
		Map.put("hotels",getHotels());

        return Map;
    }

}
