package SIPH.profile.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class ProfileDecorator extends ProfileComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected ProfileComponent record;

	public ProfileDecorator () {
		super();
		this.record = record;
		this.userIdid =  userIdid.randomUUID();
		
	public ProfileDecorator (ProfileComponent record) {
		this.userIdid =  userIdid.randomUUID();
		this.record = record;
	}

	public ProfileDecorator (UUID userIdUUID id, ProfileComponent record) {
		this.userIdid =  userIdid;
		this.record = record;
	}
	
	public ProfileDecorator (ProfileComponent record, String objectName) {
		this.userIdid =  userIdid.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public ProfileDecorator() { }

	public UUID getUserId() {
		return record.getUserId();
	}
	public void setUserId(UUID userId) {
		record.setUserId(userId);
	}
	public UUID getId() {
		return record.getId();
	}
	public void setId(UUID id) {
		record.setId(id);
	}

	public String showProfile(int userId) {
		return record.showProfile(userId);
	}

	public boolean editProfile(int userId, String name, String email, String phoneNum) {
		return record.editProfile(userId, name, email, phoneNum);
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
