package SIPH.profile.points;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import SIPH.profile.core.ProfileDecorator;
import SIPH.profile.core.Profile;
import SIPH.profile.core.ProfileComponent;

@Entity(name="profile_points")
@Table(name="profile_points")
public class ProfileImpl extends ProfileDecorator {

	public int point;
	public String milestoneLevel;
	public ProfileImpl(
        super();
        this.objectName = ProfileImpl.class.getName();
    }
    
    public ProfileImpl(int point, String milestoneLevel) {
    	super();
		this.point = point;
		this.milestoneLevel = milestoneLevel;
		this.objectName = ProfileImpl.class.getName();
    }
	
	public ProfileImpl(ProfileComponent record, int point, String milestoneLevel) {
		super(record);
		this.point = point;
		this.milestoneLevel = milestoneLevel;
		this.objectName = ProfileImpl.class.getName();
	}



}
