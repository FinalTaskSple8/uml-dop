package SIPH.auth.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class AuthenticationDecorator extends AuthenticationComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected AuthenticationComponent record;

	public AuthenticationDecorator () {
		super();
		this.record = record;
		this. =  .randomUUID();
		
	public AuthenticationDecorator (AuthenticationComponent record) {
		this. =  .randomUUID();
		this.record = record;
	}

	public AuthenticationDecorator (, AuthenticationComponent record) {
		this. =  ;
		this.record = record;
	}
	
	public AuthenticationDecorator (AuthenticationComponent record, String objectName) {
		this. =  .randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public AuthenticationDecorator() { }


	public void login(String email, String password) {
		return record.login(email, password);
	}

	public void register(String name, String email, String phoneNumber, String password) {
		return record.register(name, email, phoneNumber, password);
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
