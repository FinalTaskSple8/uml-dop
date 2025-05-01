package SIPH.auth.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

public abstract class AuthenticationResourceDecorator extends AuthenticationResourceComponent{
	protected AuthenticationResourceComponent record;

    public AuthenticationResourceDecorator(AuthenticationResourceComponent record) {
        this.record = record;
    }

    public Authentication createAuthentication(VMJExchange vmjExchange){
		return record.createAuthentication(vmjExchange);
	}

    public HashMap<String, Object> updateAuthentication(VMJExchange vmjExchange){
		return record.updateAuthentication(vmjExchange);
	}

    public HashMap<String, Object> getAuthentication(VMJExchange vmjExchange){
		return record.getAuthentication(vmjExchange);
	}

    public List<HashMap<String,Object>> getAllAuthentication(VMJExchange vmjExchange){
		return record.getAllAuthentication(vmjExchange);
	}

    public List<HashMap<String,Object>> deleteAuthentication(VMJExchange vmjExchange){
		return record.deleteAuthentication(vmjExchange);
	}

	public void login(String email, String password) {
		return record.login(email, password);
	}

	public void register(String name, String email, String phoneNumber, String password) {
		return record.register(name, email, phoneNumber, password);
	}
}
