/*
Copyright (c) 2013 Mango Games Interactive Pte Ltd 
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/
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
