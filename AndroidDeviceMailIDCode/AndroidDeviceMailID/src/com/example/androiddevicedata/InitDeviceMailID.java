package com.example.androiddevicedata;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class InitDeviceMailID implements FREFunction {

	public static final String TAG = "InitFunction";
	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		System.out.println("initFunction successfully called.");
		Log.i(TAG, "in init functions");
		return null;
	}

}
