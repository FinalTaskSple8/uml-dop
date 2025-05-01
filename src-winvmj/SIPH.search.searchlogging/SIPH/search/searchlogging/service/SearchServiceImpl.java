package SIPH.search.searchlogging;

import java.util.*;

import vmj.routing.route.VMJExchange;

import SIPH.search.core.SearchServiceDecorator;
import SIPH.search.core.SearchImpl;
import SIPH.search.core.SearchServiceComponent;

public class SearchServiceImpl extends SearchServiceDecorator {
    public SearchServiceImpl (SearchServiceComponent record) {
        super(record);
    }

    
	public void logSearch(String query) {
		// TODO: implement this method
	}
}
