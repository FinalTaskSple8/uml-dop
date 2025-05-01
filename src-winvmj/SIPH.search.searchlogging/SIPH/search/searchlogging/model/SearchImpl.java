package SIPH.search.searchlogging;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import SIPH.search.core.SearchDecorator;
import SIPH.search.core.Search;
import SIPH.search.core.SearchComponent;

@Entity(name="search_searchlogging")
@Table(name="search_searchlogging")
public class SearchImpl extends SearchDecorator {

	public SearchImpl(
        super();
        this.objectName = SearchImpl.class.getName();
    }
    
    public SearchImpl() {
    	super();
		this.objectName = SearchImpl.class.getName();
    }
	
	public SearchImpl(SearchComponent record, ) {
		super(record);
		this.objectName = SearchImpl.class.getName();
	}


	public void logSearch(String query) {
		// TODO: implement this method
	}

}
