package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
        Parse.initialize(this, "FGgIIOAC6owh8g7PNGwyUMLzXYxLTu03yELovirM", "vGfh3itGgO6sfkfLRyXith5Fpns9OIg7AuBhOd3N");
	}
}
