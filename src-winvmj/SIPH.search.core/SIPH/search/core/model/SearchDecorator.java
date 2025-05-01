package SIPH.search.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class SearchDecorator extends SearchComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected SearchComponent record;

	public SearchDecorator () {
		super();
		this.record = record;
		this. =  .randomUUID();
		
	public SearchDecorator (SearchComponent record) {
		this. =  .randomUUID();
		this.record = record;
	}

	public SearchDecorator (, SearchComponent record) {
		this. =  ;
		this.record = record;
	}
	
	public SearchDecorator (SearchComponent record, String objectName) {
		this. =  .randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public SearchDecorator() { }


	protected ManageHotels searchHotels(String query) {
		return record.searchHotels(query);
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
