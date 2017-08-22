package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ActivityRepository#findAllActivities()
	 */
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 =new Activity();
		activity1.setDescription("swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 =new Activity();
		activity2.setDescription("cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;		
		
	}

	@Override
	public Activity findAllActivity(String activityId) {
		Activity activity1 =new Activity();
		activity1.setId("1234");
		activity1.setDescription("swimming");
		activity1.setDuration(55);
		
		User user = new User();
		user.setId("5678");
		user.setName("Bryan" );
		
		activity1.setUser(user);
		return activity1;
	}

}
