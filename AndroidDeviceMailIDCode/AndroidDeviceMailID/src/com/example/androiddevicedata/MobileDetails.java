/*
Copyright (c) 2013 Mango Games Interactive Pte Ltd 
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/
package com.example.androiddevicedata;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;

public class MobileDetails 
{

	private Context _ctx;
	
	MobileDetails(Context context)
	{
		_ctx = context;
	}
	
	public String getPrimaryMailID()
	{
		Account[] allMailIDsList = AccountManager.get(_ctx).getAccountsByType("com.google");
		String firstRegisteredMailID = allMailIDsList[0].name;
		Log.d("TAG", "################# My email id that i want111 : "+ firstRegisteredMailID);
		
		if(firstRegisteredMailID != null && firstRegisteredMailID.length() > 0)
			return firstRegisteredMailID;
		else
			return null;
		//When u want to retrieve all the Primary mail IDs
		/*for(Account account: allMailIDsList)
		{
			Log.d("TAG", "############### Possible email id of user : "+ account.name);
		}*/
		
	}
	protected String getPrimaryUserName()
	{
		Account[] allMailIDsList = AccountManager.get(_ctx).getAccountsByType("com.google");
		String firstRegisteredMailID = allMailIDsList[0].name;
		if(firstRegisteredMailID != null)
		{
			String[] userNames = firstRegisteredMailID.split("@");
			if(userNames.length > 0 && userNames[0] != null)
				return userNames[0];
			else
				return null;
		}
		return null;
	}
}
