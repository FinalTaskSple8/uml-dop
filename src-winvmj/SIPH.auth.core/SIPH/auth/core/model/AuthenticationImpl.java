package SIPH.auth.core;

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


@Entity(name="authentication_impl")
@Table(name="authentication_impl")
public class AuthenticationImpl extends AuthenticationComponent {

	public AuthenticationImpl(User user) {
		this.user = user;
	}

	public AuthenticationImpl(User user) {
		this. =  .randomUUID();;
		this.user = user;
	}

	public AuthenticationImpl() { }


	public void login(String email, String password) {
		// TODO: implement this method
	}

	public void register(String name, String email, String phoneNumber, String password) {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> authenticationMap = new HashMap<String,Object>();
		authenticationMap.put("user",getUser());

        return authenticationMap;
    }

}
