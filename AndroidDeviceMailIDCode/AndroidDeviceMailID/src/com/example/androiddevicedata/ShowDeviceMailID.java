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
