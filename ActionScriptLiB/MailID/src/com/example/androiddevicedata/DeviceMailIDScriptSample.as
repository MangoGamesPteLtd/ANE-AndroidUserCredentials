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


