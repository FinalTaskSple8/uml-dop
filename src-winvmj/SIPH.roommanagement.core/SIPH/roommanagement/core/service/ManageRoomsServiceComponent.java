package SIPH.roommanagement.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class ManageRoomsServiceComponent implements ManageRoomsService{
	protected RepositoryUtil<ManageRooms> Repository;

    public ManageRoomsServiceComponent(){
        this.Repository = new RepositoryUtil<ManageRooms>(SIPH.roommanagement.core.ManageRoomsComponent.class);
    }	

    public abstract List<HashMap<String,Object>> saveManageRooms(VMJExchange vmjExchange);
    public abstract ManageRooms createManageRooms(Map<String, Object> requestBodye);
	public abstract ManageRooms createManageRooms(Map<String, Object> requestBody, Map<String, Object> response);    
	public abstract HashMap<String, Object> updateManageRooms(Map<String, Object> requestBody);
    public abstract HashMap<String, Object> getManageRooms(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> getAllManageRooms(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> transformListToHashMap(List<ManageRooms> List);
    public abstract List<HashMap<String,Object>> deleteManageRooms(Map<String, Object> requestBody);
	public abstract HashMap<String, Object> getManageRoomsById(int id);

	public abstract EByteArray getRoomByHotelId();
}
