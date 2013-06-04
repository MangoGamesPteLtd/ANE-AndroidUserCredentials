/*
Copyright (c) 2013 Mango Games Interactive Pte Ltd 
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/
package com.example.androiddevicedata
{
	import flash.external.ExtensionContext;
	
	public class DeviceMailIDScriptSample
	{
		
		private var extContext : ExtensionContext;
		public function DeviceMailIDScriptSample()
		{
			trace("in DeviceMailIDScriptSample Constructor");
			//Create and Initialise the Context
			extContext = ExtensionContext.createExtensionContext("com.example.androiddevicedata","");
			if(!extContext)
			{
				throw new Error("User Credential native extension is not supported on this platform.");
			}
		}
		
		public function init():void 
		{
			extContext.call("init");
		}
		
		public function showDeviceMailID():Object
		{	
			// obtaining value from FREObject through native code
			 return extContext.call("showDeviceMailID");
		}
	}
}


