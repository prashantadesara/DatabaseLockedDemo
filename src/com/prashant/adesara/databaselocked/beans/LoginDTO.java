package com.prashant.adesara.databaselocked.beans;

/**
 * LoginDTO contains login details. 
 * 
 * @author Prashant Adesara
 * @url http://prashantandroid.blogspot.in
 **/

public class LoginDTO
{
	private int userId;
	private String userName;
	private String password;

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(final int userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(final String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(final String password)
	{
		this.password = password;
	}
}
