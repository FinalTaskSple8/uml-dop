package SIPH.profile.core;

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


@Entity(name="profile_impl")
@Table(name="profile_impl")
public class ProfileImpl extends ProfileComponent {

	public ProfileImpl(UUID userId, User user, UUID id) {
		this.userId = userId;
		this.user = user;
		this.id = id;
	}

	public ProfileImpl(UUID userId, User user) {
		this.userIdid =  userIdid.randomUUID();;
		this.userId = userId;
		this.user = user;
	}

	public ProfileImpl() { }

	public UUID getUserId() {
		return this.userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String showProfile(int userId) {
		// TODO: implement this method
	}

	public boolean editProfile(int userId, String name, String email, String phoneNum) {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> profileMap = new HashMap<String,Object>();
		profileMap.put("userId",getUserId());
		profileMap.put("user",getUser());
		profileMap.put("id",getId());

        return profileMap;
    }

}
