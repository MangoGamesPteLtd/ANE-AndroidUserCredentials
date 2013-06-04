package com.example.androiddevicedata;

import java.util.HashMap;
import java.util.Map;



import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class DeviceMailIDExtensionContext extends FREContext {
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Map<String, FREFunction> getFunctions() {
		Map<String, FREFunction> functions = new HashMap<String, FREFunction>();
		functions.put("init", new InitDeviceMailID());
		functions.put(ShowDeviceMailID.name,new ShowDeviceMailID());
		
		return functions;
	}

}
