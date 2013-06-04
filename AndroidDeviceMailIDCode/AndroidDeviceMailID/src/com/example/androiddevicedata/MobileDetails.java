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
