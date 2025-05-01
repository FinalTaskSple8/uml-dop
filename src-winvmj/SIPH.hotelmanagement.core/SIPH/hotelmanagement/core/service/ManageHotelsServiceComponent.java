package SIPH.hotelmanagement.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class ManageHotelsServiceComponent implements ManageHotelsService{
	protected RepositoryUtil<ManageHotels> Repository;

    public ManageHotelsServiceComponent(){
        this.Repository = new RepositoryUtil<ManageHotels>(SIPH.hotelmanagement.core.ManageHotelsComponent.class);
    }	

    public abstract List<HashMap<String,Object>> saveManageHotels(VMJExchange vmjExchange);
    public abstract ManageHotels createManageHotels(Map<String, Object> requestBodye);
	public abstract ManageHotels createManageHotels(Map<String, Object> requestBody, Map<String, Object> response);    
	public abstract HashMap<String, Object> updateManageHotels(Map<String, Object> requestBody);
    public abstract HashMap<String, Object> getManageHotels(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> getAllManageHotels(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> transformListToHashMap(List<ManageHotels> List);
    public abstract List<HashMap<String,Object>> deleteManageHotels(Map<String, Object> requestBody);
	public abstract HashMap<String, Object> getManageHotelsById(int id);

	public abstract void addRoomToHotel(ManageRooms rooms);
}
