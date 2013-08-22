package com.prashant.adesara.databaselocked.activities;

import android.app.Activity;
import android.os.Bundle;

import com.prashant.adesara.databaselocked.sql.SQLOperation;

/**
 * Activity used for visible content and perform operation.
 * 
 * @author Prashant Adesara
 * @url http://prashantandroid.blogspot.in
 **/

public class UserActivity extends Activity 
{
	public static SQLOperation crudOperation = null;
    
	@Override
	protected void onCreate(final Bundle savedState) 
	{
		super.onCreate(savedState);
		setContentView(R.layout.main);
		
		crudOperation = new SQLOperation(getApplicationContext());
		
		/**
		 * Here you can access multiple times crud operation at same time and 
		 * you never got database locked exception
		 *
		 *	crudOperation.addNewUser(new UserDTO());
		 *	crudOperation.updateUser(new UserDTO());
		 *	crudOperation.deleteUser();
		 *
		 * */
	}
	
}