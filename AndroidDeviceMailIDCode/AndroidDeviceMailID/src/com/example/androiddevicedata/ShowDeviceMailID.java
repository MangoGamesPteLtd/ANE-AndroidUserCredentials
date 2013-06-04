/*
Copyright (c) 2013 Mango Games Interactive Pte Ltd 
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/
package com.example.androiddevicedata;

import android.content.Context;
import android.widget.Toast;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;


public class ShowDeviceMailID implements FREFunction 
{
	public static final String name = "showDeviceMailID";

	@Override
	public FREObject call(FREContext context, FREObject[] args) 
	{
		
		Context con= context.getActivity().getApplicationContext();
		
		MobileDetails mobileDetailsObj = new MobileDetails(con);
		FREObject obj= null;
		String mailID = null;
			
		try 
		{
			mailID = mobileDetailsObj.getPrimaryMailID();
			//userName = mobileDetailsObj.getPrimaryUserName();
								
			obj = FREObject.newObject(mailID);				
			
		}
		catch (Exception e) 
		{
			Toast.makeText(context.getActivity().getApplicationContext(), "Error 3: Exception" + e.getMessage(), 
					Toast.LENGTH_SHORT).show();	
			
			System.out.printf("context.getActivity().getApplicationContext() failed with error:\n\"%s\"\n",
							  e.toString());
			
		}
		
		return obj;
	}
}
