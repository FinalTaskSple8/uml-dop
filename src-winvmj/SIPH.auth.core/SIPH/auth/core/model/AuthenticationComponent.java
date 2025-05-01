package SIPH.auth.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="authentication_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AuthenticationComponent implements Authentication{
	@Id
	
	@ManyToOne(targetEntity=SIPH..core.Component.class)
	public  user;
	protected String objectName = AuthenticationComponent.class.getName();

	public AuthenticationComponent() {

	} 

	public AuthenticationComponent(
        User user
    ) {
        this.user = user;
    }

	public abstract User getUser();
	public abstract void setUser(User user);
	
 
	public abstract void login(String email, String password);

	public abstract void register(String name, String email, String phoneNumber, String password);

	@Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            "}";
    }
	
}
