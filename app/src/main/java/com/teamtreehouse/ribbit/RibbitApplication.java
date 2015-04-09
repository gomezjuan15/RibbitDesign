package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;
import com.teamtreehouse.ribbit.utils.ParseConstants;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
        Parse.initialize(this,
                "FGgIIOAC6owh8g7PNGwyUMLzXYxLTu03yELovirM",
                "vGfh3itGgO6sfkfLRyXith5Fpns9OIg7AuBhOd3N");

        ParseInstallation.getCurrentInstallation().saveInBackground();
	}

    public static void updateParseInstallation(ParseUser user) {

        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
