package SIPH.profile.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.profile.ProfileFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class ProfileResourceImpl extends ProfileResourceComponent{
	
	private ProfileServiceImpl profileServiceImpl = new ProfileServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/profile")
    public HashMap<String,Object> createprofile(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			Profile result = profileServiceImpl.createProfile(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/profile/update")
    public HashMap<String, Object> updateProfile(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return profileServiceImpl.updateProfile(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/profile/detail")
    public HashMap<String, Object> getProfile(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return profileServiceImpl.getProfile(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/profile/list")
    public List<HashMap<String,Object>> getAllProfile(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return profileServiceImpl.getAllProfile(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/profile/delete")
    public List<HashMap<String,Object>> deleteProfile(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return profileServiceImpl.deleteProfile(requestBody);
	}

	public String showProfile(int userId) {
		// TODO: implement this method
	}

	public boolean editProfile(int userId, String name, String email, String phoneNum) {
		// TODO: implement this method
	}
}
