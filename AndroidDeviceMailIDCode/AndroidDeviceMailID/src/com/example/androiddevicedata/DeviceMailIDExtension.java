package com.example.androiddevicedata;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class DeviceMailIDExtension implements FREExtension {
	
	
	@Override
	public FREContext createContext(String arg0) {
		return new DeviceMailIDExtensionContext();
	}
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
